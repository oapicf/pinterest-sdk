package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feed_fields.
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class FeedFields(
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

object FeedFields {
  implicit lazy val feedFieldsJsonFormat: Format[FeedFields] = {
    val realJsonFormat = Json.format[FeedFields]
    val declaredPropNames = Set("defaultCountry", "defaultAvailability", "defaultCurrency", "name", "format", "defaultLocale", "credentials", "location", "preferredProcessingSchedule", "status")
    
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
      Writes { feedFields =>
        val jsObj = realJsonFormat.writes(feedFields)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

