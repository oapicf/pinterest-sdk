package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteBusinessRoleBinding.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  * @param user Metadata for the user that updated the invite/request.
  * @param createdByBusinessId Unique identifier for the business that created the invite/request.
  * @param createdByUserId Unique identifier for the user that created the invite/request.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteBusinessRoleBinding(
  id: Option[String],
  inviteData: Option[BaseInviteDataResponseInviteData],
  isReceivedInvite: Option[Boolean],
  user: Option[JsObject],
  createdByBusinessId: Option[String],
  createdByUserId: Option[String]
  additionalProperties: 
)

object InviteBusinessRoleBinding {
  implicit lazy val inviteBusinessRoleBindingJsonFormat: Format[InviteBusinessRoleBinding] = {
    val realJsonFormat = Json.format[InviteBusinessRoleBinding]
    val declaredPropNames = Set("id", "inviteData", "isReceivedInvite", "user", "createdByBusinessId", "createdByUserId")
    
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
      Writes { inviteBusinessRoleBinding =>
        val jsObj = realJsonFormat.writes(inviteBusinessRoleBinding)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

