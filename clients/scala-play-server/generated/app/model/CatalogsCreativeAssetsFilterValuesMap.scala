package model

import play.api.libs.json._

/**
  * A map of filter attributes to their available values.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsFilterValuesMap(
  customLabel0: Option[List[String]],
  customLabel1: Option[List[String]],
  customLabel2: Option[List[String]],
  customLabel3: Option[List[String]],
  customLabel4: Option[List[String]],
  googleProductCategory0: Option[List[String]],
  googleProductCategory1: Option[List[String]],
  googleProductCategory2: Option[List[String]],
  googleProductCategory3: Option[List[String]],
  googleProductCategory4: Option[List[String]],
  googleProductCategory5: Option[List[String]],
  googleProductCategory6: Option[List[String]],
  mediaType: Option[List[MediaType]]
)

object CatalogsCreativeAssetsFilterValuesMap {
  implicit lazy val catalogsCreativeAssetsFilterValuesMapJsonFormat: Format[CatalogsCreativeAssetsFilterValuesMap] = Json.format[CatalogsCreativeAssetsFilterValuesMap]
}

