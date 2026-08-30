package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalogs Feed object
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param id ID of the feed entity.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeed(
  catalogType: CatalogsFeed.CatalogType.Value,
  createdAt: OffsetDateTime,
  credentials: Option[CatalogsFeedCredentials],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: String,
  format: CatalogsFormat,
  id: String,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: CatalogsStatus,
  updatedAt: OffsetDateTime,
  catalogId: String
  additionalProperties: 
)

object CatalogsFeed {
  implicit lazy val catalogsFeedJsonFormat: Format[CatalogsFeed] = {
    val realJsonFormat = Json.format[CatalogsFeed]
    val declaredPropNames = Set("catalogType", "createdAt", "credentials", "defaultAvailability", "defaultCountry", "defaultCurrency", "defaultLocale", "format", "id", "location", "name", "preferredProcessingSchedule", "status", "updatedAt", "catalogId")
    
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

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

