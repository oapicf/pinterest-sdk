package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Ad_account_owner.
  * @param username Public username for the user account
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AdAccountOwner(
  username: Option[String]
  additionalProperties: 
)

object AdAccountOwner {
  implicit lazy val adAccountOwnerJsonFormat: Format[AdAccountOwner] = {
    val realJsonFormat = Json.format[AdAccountOwner]
    val declaredPropNames = Set("username")
    
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
      Writes { adAccountOwner =>
        val jsObj = realJsonFormat.writes(adAccountOwner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

