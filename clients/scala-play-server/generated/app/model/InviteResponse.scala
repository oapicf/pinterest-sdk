package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteResponse.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  * @param user Metadata for the member/partner that was sent the invite/request.
  * @param businessRoles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  * @param createdByBusiness Metadata for the business that created the invite/request.
  * @param createdByUser Metadata for the user that created the invite/request.
  * @param createdTime The time the invite/request was created. Returned in milliseconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteResponse(
  id: Option[String],
  inviteData: Option[BaseInviteDataResponseInviteData],
  isReceivedInvite: Option[Boolean],
  user: Option[BusinessAccessUserSummary],
  assetsSummary: Option[InviteAssetsSummary],
  businessRoles: Option[List[String]],
  createdByBusiness: Option[JsObject],
  createdByUser: Option[JsObject],
  createdTime: Option[Int]
  additionalProperties: 
)

object InviteResponse {
  implicit lazy val inviteResponseJsonFormat: Format[InviteResponse] = {
    val realJsonFormat = Json.format[InviteResponse]
    val declaredPropNames = Set("id", "inviteData", "isReceivedInvite", "user", "assetsSummary", "businessRoles", "createdByBusiness", "createdByUser", "createdTime")
    
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
      Writes { inviteResponse =>
        val jsObj = realJsonFormat.writes(inviteResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

