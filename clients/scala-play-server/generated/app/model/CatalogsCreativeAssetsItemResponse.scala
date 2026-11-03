package model

import play.api.libs.json._

/**
  * Object describing a creative assets item record
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsItemResponse(
  attributes: Option[CatalogsCreativeAssetsAttributes],
  catalogType: CatalogsCreativeAssetsItemResponse.CatalogType.Value,
  creativeAssetsId: Option[String],
  itemResponseKind: CatalogsCreativeAssetsItemResponse.ItemResponseKind.Value,
  pins: Option[List[Pin]]
)

object CatalogsCreativeAssetsItemResponse {
  implicit lazy val catalogsCreativeAssetsItemResponseJsonFormat: Format[CatalogsCreativeAssetsItemResponse] = Json.format[CatalogsCreativeAssetsItemResponse]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val CreativeAssetsItem = Value("creative_assets_item")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

