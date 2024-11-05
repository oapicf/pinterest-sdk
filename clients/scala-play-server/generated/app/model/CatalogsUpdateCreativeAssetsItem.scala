package model

import play.api.libs.json._

/**
  * A creative assets item to be updated.
  * @param creativeAssetsId The catalog creative assets item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsUpdateCreativeAssetsItem(
  creativeAssetsId: String,
  operation: CatalogsUpdateCreativeAssetsItem.Operation.Value,
  attributes: CatalogsUpdatableCreativeAssetsAttributes
)

object CatalogsUpdateCreativeAssetsItem {
  implicit lazy val catalogsUpdateCreativeAssetsItemJsonFormat: Format[CatalogsUpdateCreativeAssetsItem] = Json.format[CatalogsUpdateCreativeAssetsItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPDATE = Value("UPDATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

