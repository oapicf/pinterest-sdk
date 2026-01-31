package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdvertiserDefinedEvent.
  * @param name raw string name of the event, usually logged as raw_event_name in our dataset
  * @param mappedConversionType standard type mapped to ADE for optimization
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvertiserDefinedEvent(
  name: Option[String],
  mappedConversionType: Option[AdvertiserDefinedEvent.MappedConversionType.Value]
)

object AdvertiserDefinedEvent {
  implicit lazy val advertiserDefinedEventJsonFormat: Format[AdvertiserDefinedEvent] = Json.format[AdvertiserDefinedEvent]

  // noinspection TypeAnnotation
  object MappedConversionType extends Enumeration {
    val PAGELOAD = Value("PAGE_LOAD")
    val UNKNOWN = Value("UNKNOWN")
    val INITIALIZED = Value("INITIALIZED")
    val PAGEVISIT = Value("PAGE_VISIT")
    val SIGNUP = Value("SIGNUP")
    val CHECKOUT = Value("CHECKOUT")
    val CUSTOM = Value("CUSTOM")
    val VIEWCATEGORY = Value("VIEW_CATEGORY")
    val SEARCH = Value("SEARCH")
    val ADDTOCART = Value("ADD_TO_CART")
    val WATCHVIDEO = Value("WATCH_VIDEO")
    val LEAD = Value("LEAD")
    val APPINSTALL = Value("APP_INSTALL")
    val WEBSESSION = Value("WEB_SESSION")
    val EXTERNALMEASUREMENT = Value("EXTERNAL_MEASUREMENT")
    val ADDPAYMENTINFO = Value("ADD_PAYMENT_INFO")
    val ADDTOWISHLIST = Value("ADD_TO_WISHLIST")
    val INITIATECHECKOUT = Value("INITIATE_CHECKOUT")
    val SUBSCRIBE = Value("SUBSCRIBE")
    val VIEWCONTENT = Value("VIEW_CONTENT")
    val ADVERTISERDEFINEDEVENT = Value("ADVERTISER_DEFINED_EVENT")
    val APPOPEN = Value("APP_OPEN")
    val CONTACT = Value("CONTACT")
    val SCHEDULE = Value("SCHEDULE")
    val FINDLOCATION = Value("FIND_LOCATION")
    val CUSTOMIZEPRODUCT = Value("CUSTOMIZE_PRODUCT")
    val SUBMITAPPLICATION = Value("SUBMIT_APPLICATION")
    val STARTTRIAL = Value("START_TRIAL")

    type MappedConversionType = Value
    implicit lazy val MappedConversionTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

