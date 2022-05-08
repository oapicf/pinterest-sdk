package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalogs Catalogs Feed object
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFeed(
  createdAt: Option[OffsetDateTime],
  id: Option[String],
  updatedAt: Option[OffsetDateTime],
  defaultCountry: Country,
  defaultAvailability: ProductAvailabilityType,
  defaultCurrency: NullableCurrency,
  name: String,
  format: CatalogsFormat,
  defaultLocale: String,
  credentials: CatalogsFeedCredentials,
  location: String,
  preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
  status: CatalogsStatus
  additionalProperties: 
)

object CatalogsFeed {
  implicit lazy val catalogsFeedJsonFormat: Format[CatalogsFeed] = {
    val realJsonFormat = Json.format[CatalogsFeed]
    val declaredPropNames = Set("createdAt", "id", "updatedAt", "defaultCountry", "defaultAvailability", "defaultCurrency", "name", "format", "defaultLocale", "credentials", "location", "preferredProcessingSchedule", "status")
    
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
      Writes { catalogsFeed =>
        val jsObj = realJsonFormat.writes(catalogsFeed)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

