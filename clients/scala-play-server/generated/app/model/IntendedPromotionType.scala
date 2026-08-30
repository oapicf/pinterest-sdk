package model

import play.api.libs.json._

/**
  * Specifies the intended promotion type for the campaign.  Note: This field is immutable unless the campaign is in draft status.  **STANDARD_AD** - For ads derived from Pins. - Supported for all objective types except for current CATALOG\\_SALES and WEB\\_CONVERSION, which are being deprecated. - For simplified objective types.  **CATALOG** - For creating product group promotions. - Supported for CONSIDERATION and SALES objective types. - For simplified objective types.  **LEGACY** - Intended only for maintaining backward compatibility. - Must be used for CATALOG\\_SALES and WEB\\_CONVERSION. - Supported for CATALOG\\_SALES and WEB\\_CONVERSION objective types.  **If you do not provide this parameter, the default is:** - LEGACY for CATALOG\\_SALES and WEB\\_CONVERSION - STANDARD_AD for other objective types
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntendedPromotionType(
)

object IntendedPromotionType {
  implicit lazy val intendedPromotionTypeJsonFormat: Format[IntendedPromotionType] = Json.format[IntendedPromotionType]
}

