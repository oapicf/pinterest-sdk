package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagCreate.
  * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param mdFrequency Metadata ingestion frequency.
  * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param name Conversion tag name.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionTagCreate(
  aemEnabled: Option[Boolean],
  mdFrequency: Option[BigDecimal],
  aemFnlnEnabled: Option[Boolean],
  aemPhEnabled: Option[Boolean],
  aemGeEnabled: Option[Boolean],
  aemDbEnabled: Option[Boolean],
  aemLocEnabled: Option[Boolean],
  name: String
  additionalProperties: 
)

object ConversionTagCreate {
  implicit lazy val conversionTagCreateJsonFormat: Format[ConversionTagCreate] = {
    val realJsonFormat = Json.format[ConversionTagCreate]
    val declaredPropNames = Set("aemEnabled", "mdFrequency", "aemFnlnEnabled", "aemPhEnabled", "aemGeEnabled", "aemDbEnabled", "aemLocEnabled", "name")
    
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
      Writes { conversionTagCreate =>
        val jsObj = realJsonFormat.writes(conversionTagCreate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

