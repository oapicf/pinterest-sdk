package model

import play.api.libs.json._

/**
  * Object describing a creative assets item error
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsItemErrorResponse(
  catalogType: CatalogsCreativeAssetsItemErrorResponse.CatalogType.Value,
  creativeAssetsId: Option[String],
  errors: List[ItemValidationEvent],
  itemResponseKind: CatalogsCreativeAssetsItemErrorResponse.ItemResponseKind.Value
)

object CatalogsCreativeAssetsItemErrorResponse {
  implicit lazy val catalogsCreativeAssetsItemErrorResponseJsonFormat: Format[CatalogsCreativeAssetsItemErrorResponse] = Json.format[CatalogsCreativeAssetsItemErrorResponse]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val CreativeAssetsItemError = Value("creative_assets_item_error")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

