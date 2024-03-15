package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagConfigs.
  * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param mdFrequency Metadata ingestion frequency.
  * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ConversionTagConfigs(
  aemEnabled: Option[Boolean],
  mdFrequency: Option[BigDecimal],
  aemFnlnEnabled: Option[Boolean],
  aemPhEnabled: Option[Boolean],
  aemGeEnabled: Option[Boolean],
  aemDbEnabled: Option[Boolean],
  aemLocEnabled: Option[Boolean]
)

object ConversionTagConfigs {
  implicit lazy val conversionTagConfigsJsonFormat: Format[ConversionTagConfigs] = Json.format[ConversionTagConfigs]
}

