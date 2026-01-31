package model

import play.api.libs.json._

/**
  * A map of filter attributes to their available values.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelFilterValuesMap(
  brand: Option[List[String]],
  customLabel0: Option[List[String]],
  customLabel1: Option[List[String]],
  customLabel2: Option[List[String]],
  customLabel3: Option[List[String]],
  customLabel4: Option[List[String]]
)

object CatalogsHotelFilterValuesMap {
  implicit lazy val catalogsHotelFilterValuesMapJsonFormat: Format[CatalogsHotelFilterValuesMap] = Json.format[CatalogsHotelFilterValuesMap]
}

