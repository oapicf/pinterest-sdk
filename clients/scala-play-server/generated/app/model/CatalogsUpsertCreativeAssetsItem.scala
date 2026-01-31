package model

import play.api.libs.json._

/**
  * A creative assets item to be upserted.
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsUpsertCreativeAssetsItem(
  attributes: CatalogsCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: CatalogsUpsertCreativeAssetsItem.Operation.Value
)

object CatalogsUpsertCreativeAssetsItem {
  implicit lazy val catalogsUpsertCreativeAssetsItemJsonFormat: Format[CatalogsUpsertCreativeAssetsItem] = Json.format[CatalogsUpsertCreativeAssetsItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPSERT = Value("UPSERT")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

