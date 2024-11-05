package model

import play.api.libs.json._

/**
  * A creative assets item to be upserted.
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsUpsertCreativeAssetsItem(
  creativeAssetsId: String,
  operation: CatalogsUpsertCreativeAssetsItem.Operation.Value,
  attributes: CatalogsCreativeAssetsAttributes
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

