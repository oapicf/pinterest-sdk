package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagConfigs.
  * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @param mdFrequency Metadata ingestion frequency.
  * @param noCodeCapiDomains List of advertiser subdomains configured for NoCodeCAPI calls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionTagConfigs(
  aemDbEnabled: Option[Boolean],
  aemEnabled: Option[Boolean],
  aemExternalIdEnabled: Option[Boolean],
  aemFnlnEnabled: Option[Boolean],
  aemGeEnabled: Option[Boolean],
  aemLocEnabled: Option[Boolean],
  aemPhEnabled: Option[Boolean],
  mdFrequency: Option[BigDecimal],
  noCodeCapiDomains: Option[List[String]]
)

object ConversionTagConfigs {
  implicit lazy val conversionTagConfigsJsonFormat: Format[ConversionTagConfigs] = Json.format[ConversionTagConfigs]
}

