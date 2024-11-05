package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormUpdateRequest.
  * @param name Internal name of the lead form.
  * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
  * @param completionMessage A message for people who complete the form to let them know what happens next.
  * @param disclosureLanguage Additional disclosure language to be included in the lead form.
  * @param questions List of questions to be displayed on the lead form.
  * @param policyLinks List of additional policy links to be displayed on the lead form.
  * @param id The ID of this lead form to be updated
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadFormUpdateRequest(
  name: Option[String],
  privacyPolicyLink: Option[String],
  hasAcceptedTerms: Option[Boolean],
  completionMessage: Option[String],
  status: Option[LeadFormStatus],
  disclosureLanguage: Option[String],
  questions: Option[List[LeadFormQuestion]],
  policyLinks: Option[List[LeadFormCommonPolicyLinksInner]],
  id: String
  additionalProperties: 
)

object LeadFormUpdateRequest {
  implicit lazy val leadFormUpdateRequestJsonFormat: Format[LeadFormUpdateRequest] = {
    val realJsonFormat = Json.format[LeadFormUpdateRequest]
    val declaredPropNames = Set("name", "privacyPolicyLink", "hasAcceptedTerms", "completionMessage", "status", "disclosureLanguage", "questions", "policyLinks", "id")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { leadFormUpdateRequest =>
        val jsObj = realJsonFormat.writes(leadFormUpdateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

