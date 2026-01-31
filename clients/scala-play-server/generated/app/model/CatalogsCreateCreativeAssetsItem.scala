package model

import play.api.libs.json._

/**
  * A creative assets item to be created.
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreateCreativeAssetsItem(
  creativeAssetsId: String,
  operation: CatalogsCreateCreativeAssetsItem.Operation.Value,
  attributes: CatalogsCreativeAssetsAttributes
)

object CatalogsCreateCreativeAssetsItem {
  implicit lazy val catalogsCreateCreativeAssetsItemJsonFormat: Format[CatalogsCreateCreativeAssetsItem] = Json.format[CatalogsCreateCreativeAssetsItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

