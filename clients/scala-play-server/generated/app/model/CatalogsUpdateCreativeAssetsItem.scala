package model

import play.api.libs.json._

/**
  * A creative assets item to be updated.
  * @param creativeAssetsId The catalog creative assets item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsUpdateCreativeAssetsItem(
  attributes: CatalogsUpdatableCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: CatalogsUpdateCreativeAssetsItem.Operation.Value
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

