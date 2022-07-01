package model

import play.api.libs.json._

/**
  * Use this if your feed file requires username and password.
  * @param password The required password for downloading a feed.
  * @param username The required username for downloading a feed.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsFeedCredentials(
  password: String,
  username: String
  additionalProperties: 
)

object CatalogsFeedCredentials {
  implicit lazy val catalogsFeedCredentialsJsonFormat: Format[CatalogsFeedCredentials] = {
    val realJsonFormat = Json.format[CatalogsFeedCredentials]
    val declaredPropNames = Set("password", "username")
    
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
      Writes { catalogsFeedCredentials =>
        val jsObj = realJsonFormat.writes(catalogsFeedCredentials)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

