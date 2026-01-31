package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormResponse.
  * @param completionMessage A message for people who complete the form to let them know what happens next.
  * @param disclosureLanguage Additional disclosure language to be included in the lead form.
  * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
  * @param name Internal name of the lead form.
  * @param policyLinks List of additional policy links to be displayed on the lead form.
  * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  * @param questions List of questions to be displayed on the lead form.
  * @param adAccountId The Ad Account ID that this lead form belongs to.
  * @param createdTime Lead form creation time. Unix timestamp in seconds.
  * @param id The ID of this lead form
  * @param updatedTime Last update time. Unix timestamp in seconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadFormResponse(
  completionMessage: Option[String],
  disclosureLanguage: Option[String],
  hasAcceptedTerms: Option[Boolean],
  name: Option[String],
  policyLinks: Option[List[LeadFormCommonPolicyLinksInner]],
  privacyPolicyLink: Option[String],
  questions: Option[List[LeadFormQuestion]],
  status: Option[LeadFormStatus],
  adAccountId: Option[String],
  createdTime: Option[Int],
  id: Option[String],
  updatedTime: Option[Int]
  additionalProperties: 
)

object LeadFormResponse {
  implicit lazy val leadFormResponseJsonFormat: Format[LeadFormResponse] = {
    val realJsonFormat = Json.format[LeadFormResponse]
    val declaredPropNames = Set("completionMessage", "disclosureLanguage", "hasAcceptedTerms", "name", "policyLinks", "privacyPolicyLink", "questions", "status", "adAccountId", "createdTime", "id", "updatedTime")
    
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
      Writes { leadFormResponse =>
        val jsObj = realJsonFormat.writes(leadFormResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

