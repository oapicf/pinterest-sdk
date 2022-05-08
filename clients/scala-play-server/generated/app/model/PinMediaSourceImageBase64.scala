package model

import play.api.libs.json._

/**
  * Base64-encoded image media source
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class PinMediaSourceImageBase64(
  sourceType: PinMediaSourceImageBase64.SourceType.Value,
  contentType: PinMediaSourceImageBase64.ContentType.Value,
  data: String
  additionalProperties: 
)

object PinMediaSourceImageBase64 {
  implicit lazy val pinMediaSourceImageBase64JsonFormat: Format[PinMediaSourceImageBase64] = {
    val realJsonFormat = Json.format[PinMediaSourceImageBase64]
    val declaredPropNames = Set("sourceType", "contentType", "data")
    
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
      Writes { pinMediaSourceImageBase64 =>
        val jsObj = realJsonFormat.writes(pinMediaSourceImageBase64)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val ImageBase64 = Value("image_base64")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ContentType extends Enumeration {
    val Jpeg = Value("image/jpeg")
    val Png = Value("image/png")

    type ContentType = Value
    implicit lazy val ContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

