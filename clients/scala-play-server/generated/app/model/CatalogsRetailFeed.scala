package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalogs Retail Feed object
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailFeed(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  name: String,
  format: CatalogsFormat,
  catalogType: CatalogsType,
  credentials: CatalogsFeedCredentials,
  location: String,
  preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
  status: CatalogsStatus,
  defaultCurrency: NullableCurrency,
  defaultLocale: String,
  defaultCountry: Country,
  defaultAvailability: ProductAvailabilityType
  additionalProperties: 
)

object CatalogsRetailFeed {
  implicit lazy val catalogsRetailFeedJsonFormat: Format[CatalogsRetailFeed] = {
    val realJsonFormat = Json.format[CatalogsRetailFeed]
    val declaredPropNames = Set("createdAt", "id", "updatedAt", "name", "format", "catalogType", "credentials", "location", "preferredProcessingSchedule", "status", "defaultCurrency", "defaultLocale", "defaultCountry", "defaultAvailability")
    
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
      Writes { catalogsRetailFeed =>
        val jsObj = realJsonFormat.writes(catalogsRetailFeed)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

