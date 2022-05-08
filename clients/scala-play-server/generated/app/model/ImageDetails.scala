package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageDetails.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class ImageDetails(
  width: Int,
  height: Int,
  url: String
  additionalProperties: 
)

object ImageDetails {
  implicit lazy val imageDetailsJsonFormat: Format[ImageDetails] = {
    val realJsonFormat = Json.format[ImageDetails]
    val declaredPropNames = Set("width", "height", "url")
    
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
      Writes { imageDetails =>
        val jsObj = realJsonFormat.writes(imageDetails)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

