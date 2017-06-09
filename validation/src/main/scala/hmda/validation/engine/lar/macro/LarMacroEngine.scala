package hmda.validation.engine.lar.`macro`

import hmda.validation._
import hmda.model.validation.Macro
import hmda.validation.api.ValidationApi
import hmda.validation.context.ValidationContext
import hmda.validation.engine.lar.LarCommonEngine
import hmda.validation.rules.lar.`macro`.MacroEditTypes.LoanApplicationRegisterSource
import hmda.validation.rules.lar.`macro`._

import scala.concurrent.Future

trait LarMacroEngine extends LarCommonEngine with ValidationApi {

  def checkMacro[_: AS: MAT: EC](larSource: LoanApplicationRegisterSource, ctx: ValidationContext): Future[LarSourceValidation] = {
    Future.sequence(
      List(
        Q006,
        Q007,
        Q008,
        Q009,
        Q010,
        Q011.inContext(ctx),
        Q015,
        Q016,
        Q023,
        Q031,
        Q047,
        Q048,
        Q053,
        Q054,
        Q055,
        Q056,
        Q057,
        Q058,
        Q061,
        Q062,
        Q063,
        Q065,
        Q070.inContext(ctx),
        Q071.inContext(ctx),
        Q072.inContext(ctx),
        Q073,
        Q074,
        Q075.inContext(ctx),
        Q076.inContext(ctx),
        Q080,
        Q081,
        Q082,
        Q083
      ).map(checkAsync(_, larSource, "", Macro, false))
    )
      .map(checks => validateAll(checks, larSource))

  }

}
