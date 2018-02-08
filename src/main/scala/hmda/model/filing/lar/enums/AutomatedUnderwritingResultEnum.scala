package hmda.model.filing.lar.enums

sealed trait AutomatedUnderwritingResultEnum {
  val code: Int
  val description: String
}

object AutomatedUnderwritingResultEnum {
  val values = (1 to 17).toList

  def valueOf(code: Int): AutomatedUnderwritingResultEnum = {
    code match {
      case 1  => ApproveEligible
      case 2  => ApproveIneligible
      case 3  => ReferEligilbe
      case 4  => ReferIneligible
      case 5  => ReferWithCaution
      case 6  => OutOfScope
      case 7  => Error
      case 8  => Accept
      case 9  => Caution
      case 10 => Ineligible
      case 11 => Incomplete
      case 12 => Invalid
      case 13 => Refer
      case 14 => Eligible
      case 15 => UnableToDetermineOrUnknown
      case 16 => OtherAutomatedUnderwritingResult
      case 17 => AutomatedUnderwritingResultNotApplicable
      case _ =>
        throw new Exception("Invalid Automated Underwriting Result Code")
    }
  }
}

case object ApproveEligible extends AutomatedUnderwritingResultEnum {
  override val code: Int = 1
  override val description: String = "Approve/Eligible"
}

case object ApproveIneligible extends AutomatedUnderwritingResultEnum {
  override val code: Int = 2
  override val description: String = "Approve/Ineligible"
}

case object ReferEligilbe extends AutomatedUnderwritingResultEnum {
  override val code: Int = 3
  override val description: String = "Refer/Eligible"
}

case object ReferIneligible extends AutomatedUnderwritingResultEnum {
  override val code: Int = 4
  override val description: String = "Refer/Ineligible"
}

case object ReferWithCaution extends AutomatedUnderwritingResultEnum {
  override val code: Int = 5
  override val description: String = "Refer with Caution"
}

case object OutOfScope extends AutomatedUnderwritingResultEnum {
  override val code: Int = 6
  override val description: String = "Out of Scope"
}

case object Error extends AutomatedUnderwritingResultEnum {
  override val code: Int = 7
  override val description: String = "Error"
}

case object Accept extends AutomatedUnderwritingResultEnum {
  override val code: Int = 8
  override val description: String = "Accept"
}

case object Caution extends AutomatedUnderwritingResultEnum {
  override val code: Int = 9
  override val description: String = "Caution"
}

case object Ineligible extends AutomatedUnderwritingResultEnum {
  override val code: Int = 10
  override val description: String = "Ineligible"
}

case object Incomplete extends AutomatedUnderwritingResultEnum {
  override val code: Int = 11
  override val description: String = "Incomplete"
}

case object Invalid extends AutomatedUnderwritingResultEnum {
  override val code: Int = 12
  override val description: String = "Invalid"
}

case object Refer extends AutomatedUnderwritingResultEnum {
  override val code: Int = 13
  override val description: String = "Refer"
}

case object Eligible extends AutomatedUnderwritingResultEnum {
  override val code: Int = 14
  override val description: String = "Eligible"
}

case object UnableToDetermineOrUnknown extends AutomatedUnderwritingResultEnum {
  override val code: Int = 15
  override val description: String = "Unable to Determine or Unknown"
}

case object OtherAutomatedUnderwritingResult
    extends AutomatedUnderwritingResultEnum {
  override val code: Int = 16
  override val description: String = "Other"
}

case object AutomatedUnderwritingResultNotApplicable
    extends AutomatedUnderwritingResultEnum {
  override val code: Int = 17
  override val description: String = "Not applicable"
}
