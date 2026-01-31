package model

import play.api.libs.json._

/**
  * <p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelProductGroupType(
)

object CatalogsHotelProductGroupType {
  implicit lazy val catalogsHotelProductGroupTypeJsonFormat: Format[CatalogsHotelProductGroupType] = Json.format[CatalogsHotelProductGroupType]
}

