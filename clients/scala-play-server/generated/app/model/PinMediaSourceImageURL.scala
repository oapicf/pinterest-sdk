package model

import play.api.libs.json._

/**
  * Image URL-based media source
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class PinMediaSourceImageURL(
  sourceType: PinMediaSourceImageURL.SourceType.Value,
  url: String
  additionalProperties: 
)

object PinMediaSourceImageURL {
  implicit lazy val pinMediaSourceImageURLJsonFormat: Format[PinMediaSourceImageURL] = {
    val realJsonFormat = Json.format[PinMediaSourceImageURL]
    val declaredPropNames = Set("sourceType", "url")
    
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
      Writes { pinMediaSourceImageURL =>
        val jsObj = realJsonFormat.writes(pinMediaSourceImageURL)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val ImageUrl = Value("image_url")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

