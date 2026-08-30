package model

import play.api.libs.json._

/**
  * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductGroupPromotionCustomizableCTAType(
)

object ProductGroupPromotionCustomizableCTAType {
  implicit lazy val productGroupPromotionCustomizableCTATypeJsonFormat: Format[ProductGroupPromotionCustomizableCTAType] = Json.format[ProductGroupPromotionCustomizableCTAType]
}

