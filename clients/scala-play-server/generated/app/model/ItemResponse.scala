package model

import play.api.libs.json._

/**
  * Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
  * @param itemId The catalog item id in the merchant namespace
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  * @param pins The pins mapped to the item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemResponse(
  attributes: Option[CatalogsCreativeAssetsAttributes],
  catalogType: ItemResponse.CatalogType.Value,
  itemId: Option[String],
  itemResponseKind: ItemResponse.ItemResponseKind.Value,
  pins: Option[List[Pin]],
  hotelId: Option[String],
  creativeAssetsId: Option[String],
  errors: List[ItemValidationEvent]
  additionalProperties: 
)

object ItemResponse {
  implicit lazy val itemResponseJsonFormat: Format[ItemResponse] = {
    val realJsonFormat = Json.format[ItemResponse]
    val declaredPropNames = Set("attributes", "catalogType", "itemId", "itemResponseKind", "pins", "hotelId", "creativeAssetsId", "errors")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { itemResponse =>
        val jsObj = realJsonFormat.writes(itemResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val CreativeAssetsItemError = Value("creative_assets_item_error")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

