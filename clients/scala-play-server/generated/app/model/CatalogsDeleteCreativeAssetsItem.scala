package model

import play.api.libs.json._

/**
  * A creative assets item to be deleted
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

