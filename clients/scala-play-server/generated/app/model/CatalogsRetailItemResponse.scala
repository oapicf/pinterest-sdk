package model

import play.api.libs.json._

/**
  * Object describing a retail item record
  * @param itemId The catalog retail item id in the merchant namespace
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailItemResponse(
  attributes: Option[ItemAttributes],
  catalogType: CatalogsRetailItemResponse.CatalogType.Value,
  itemId: Option[String],
  itemResponseKind: CatalogsRetailItemResponse.ItemResponseKind.Value,
  pins: Option[List[Pin]]
)

object CatalogsRetailItemResponse {
  implicit lazy val catalogsRetailItemResponseJsonFormat: Format[CatalogsRetailItemResponse] = Json.format[CatalogsRetailItemResponse]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val RetailItem = Value("retail_item")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

