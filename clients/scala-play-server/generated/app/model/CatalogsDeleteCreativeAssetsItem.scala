package model

import play.api.libs.json._

/**
  * A creative assets item to be deleted
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsDeleteCreativeAssetsItem(
  creativeAssetsId: String,
  operation: CatalogsDeleteCreativeAssetsItem.Operation.Value
)

object CatalogsDeleteCreativeAssetsItem {
  implicit lazy val catalogsDeleteCreativeAssetsItemJsonFormat: Format[CatalogsDeleteCreativeAssetsItem] = Json.format[CatalogsDeleteCreativeAssetsItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

