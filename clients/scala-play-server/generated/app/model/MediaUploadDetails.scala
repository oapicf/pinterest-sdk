package model

import play.api.libs.json._

/**
  * Media upload details
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class MediaUploadDetails(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  status: Option[MediaUploadStatus]
  additionalProperties: 
)

object MediaUploadDetails {
  implicit lazy val mediaUploadDetailsJsonFormat: Format[MediaUploadDetails] = {
    val realJsonFormat = Json.format[MediaUploadDetails]
    val declaredPropNames = Set("mediaId", "mediaType", "status")
    
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
      Writes { mediaUploadDetails =>
        val jsObj = realJsonFormat.writes(mediaUploadDetails)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

