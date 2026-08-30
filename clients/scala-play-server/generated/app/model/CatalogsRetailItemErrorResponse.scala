package model

import play.api.libs.json._

/**
  * Object describing a retail item error
  * @param errors Array with the errors for the item id requested
  * @param itemId The catalog item id in the merchant namespace
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailItemErrorResponse(
  catalogType: CatalogsRetailItemErrorResponse.CatalogType.Value,
  errors: List[ItemValidationEvent],
  itemId: Option[String],
  itemResponseKind: CatalogsRetailItemErrorResponse.ItemResponseKind.Value
)

object CatalogsRetailItemErrorResponse {
  implicit lazy val catalogsRetailItemErrorResponseJsonFormat: Format[CatalogsRetailItemErrorResponse] = Json.format[CatalogsRetailItemErrorResponse]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val RetailItemError = Value("retail_item_error")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

