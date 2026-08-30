package model

import play.api.libs.json._

/**
  * A creative assets item to be created.
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreateCreativeAssetsItem(
  attributes: CatalogsCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: CatalogsCreateCreativeAssetsItem.Operation.Value
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

