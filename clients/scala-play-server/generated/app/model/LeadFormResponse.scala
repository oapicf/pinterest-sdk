package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormResponse.
  * @param name Internal name of the lead form.
  * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
  * @param completionMessage A message for people who complete the form to let them know what happens next.
  * @param disclosureLanguage Additional disclosure language to be included in the lead form.
  * @param questions List of questions to be displayed on the lead form.
  * @param id The ID of this lead form
  * @param adAccountId The Ad Account ID that this lead form belongs to.
  * @param createdTime Lead form creation time. Unix timestamp in seconds.
  * @param updatedTime Last update time. Unix timestamp in seconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class LeadFormResponse(
  name: Option[String],
  privacyPolicyLink: Option[String],
  hasAcceptedTerms: Option[Boolean],
  completionMessage: Option[String],
  status: Option[LeadFormStatus],
  disclosureLanguage: Option[String],
  questions: Option[List[LeadFormQuestion]],
  id: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int]
  additionalProperties: 
)

object LeadFormResponse {
  implicit lazy val leadFormResponseJsonFormat: Format[LeadFormResponse] = {
    val realJsonFormat = Json.format[LeadFormResponse]
    val declaredPropNames = Set("name", "privacyPolicyLink", "hasAcceptedTerms", "completionMessage", "status", "disclosureLanguage", "questions", "id", "adAccountId", "createdTime", "updatedTime")
    
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

