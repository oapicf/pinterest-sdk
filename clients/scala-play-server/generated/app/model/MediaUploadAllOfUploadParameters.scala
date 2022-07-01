package model

import play.api.libs.json._

/**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class MediaUploadAllOfUploadParameters(
  xAmzDate: Option[String],
  xAmzSignature: Option[String],
  xAmzSecurityToken: Option[String],
  xAmzAlgorithm: Option[String],
  key: Option[String],
  policy: Option[String],
  xAmzCredential: Option[String],
  contentType: Option[String]
  additionalProperties: 
)

object MediaUploadAllOfUploadParameters {
  implicit lazy val mediaUploadAllOfUploadParametersJsonFormat: Format[MediaUploadAllOfUploadParameters] = {
    val realJsonFormat = Json.format[MediaUploadAllOfUploadParameters]
    val declaredPropNames = Set("xAmzDate", "xAmzSignature", "xAmzSecurityToken", "xAmzAlgorithm", "key", "policy", "xAmzCredential", "contentType")
    
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
      Writes { mediaUploadAllOfUploadParameters =>
        val jsObj = realJsonFormat.writes(mediaUploadAllOfUploadParameters)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

