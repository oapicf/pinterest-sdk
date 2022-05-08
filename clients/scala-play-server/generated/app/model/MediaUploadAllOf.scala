package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MediaUpload_allOf.
  * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  * @param uploadUrl The URL where you will POST your media file.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class MediaUploadAllOf(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  uploadUrl: Option[String],
  uploadParameters: Option[MediaUploadAllOfUploadParameters]
  additionalProperties: 
)

object MediaUploadAllOf {
  implicit lazy val mediaUploadAllOfJsonFormat: Format[MediaUploadAllOf] = {
    val realJsonFormat = Json.format[MediaUploadAllOf]
    val declaredPropNames = Set("mediaId", "mediaType", "uploadUrl", "uploadParameters")
    
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
      Writes { mediaUploadAllOf =>
        val jsObj = realJsonFormat.writes(mediaUploadAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

