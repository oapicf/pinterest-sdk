package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalogs Creative Asset Feed object
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsFeed(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  catalogId: String,
  catalogType: CatalogsType,
  credentials: CatalogsFeedCredentials,
  defaultCountry: Country,
  defaultCurrency: NullableCurrency,
  defaultLocale: String,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
  status: CatalogsStatus
  additionalProperties: 
)

object CatalogsCreativeAssetsFeed {
  implicit lazy val catalogsCreativeAssetsFeedJsonFormat: Format[CatalogsCreativeAssetsFeed] = {
    val realJsonFormat = Json.format[CatalogsCreativeAssetsFeed]
    val declaredPropNames = Set("createdAt", "id", "updatedAt", "catalogId", "catalogType", "credentials", "defaultCountry", "defaultCurrency", "defaultLocale", "format", "location", "name", "preferredProcessingSchedule", "status")
    
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
      Writes { catalogsCreativeAssetsFeed =>
        val jsObj = realJsonFormat.writes(catalogsCreativeAssetsFeed)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

