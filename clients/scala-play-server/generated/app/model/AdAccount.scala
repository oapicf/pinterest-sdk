package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccount.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class AdAccount(
  id: Option[String],
  name: Option[String],
  owner: Option[AdAccountOwner],
  country: Option[Country],
  currency: Option[Currency]
  additionalProperties: 
)

object AdAccount {
  implicit lazy val adAccountJsonFormat: Format[AdAccount] = {
    val realJsonFormat = Json.format[AdAccount]
    val declaredPropNames = Set("id", "name", "owner", "country", "currency")
    
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
      Writes { adAccount =>
        val jsObj = realJsonFormat.writes(adAccount)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

