package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param mdFrequency Metadata ingestion frequency.
  * @param name Conversion tag name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionTagCreate(
  aemDbEnabled: Option[Boolean],
  aemEnabled: Option[Boolean],
  aemExternalIdEnabled: Option[Boolean],
  aemFnlnEnabled: Option[Boolean],
  aemGeEnabled: Option[Boolean],
  aemLocEnabled: Option[Boolean],
  aemPhEnabled: Option[Boolean],
  mdFrequency: Option[BigDecimal],
  name: String
)

object ConversionTagCreate {
  implicit lazy val conversionTagCreateJsonFormat: Format[ConversionTagCreate] = Json.format[ConversionTagCreate]
}

