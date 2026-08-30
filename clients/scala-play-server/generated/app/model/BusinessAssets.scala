package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BusinessAssets.
  * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
  * @param assetId Unique identifier of a business asset.
  * @param permissions Permission levels the requesting business has on an asset.
  * @param catalogInfo An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessAssets(
  assetGroupInfo: Option[AssetGroupBinding],
  assetId: Option[String],
  assetType: Option[AssetTypeResponse],
  permissions: Option[List[String]],
  catalogInfo: Option[CatalogBinding]
  additionalProperties: 
)

object BusinessAssets {
  implicit lazy val businessAssetsJsonFormat: Format[BusinessAssets] = {
    val realJsonFormat = Json.format[BusinessAssets]
    val declaredPropNames = Set("assetGroupInfo", "assetId", "assetType", "permissions", "catalogInfo")
    
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
      Writes { businessAssets =>
        val jsObj = realJsonFormat.writes(businessAssets)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

