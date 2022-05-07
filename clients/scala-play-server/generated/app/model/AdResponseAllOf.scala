package model

import play.api.libs.json._

/**
  * Creation fields
  * @param adGroupId ID of the ad group that contains the ad.
  * @param androidDeepLink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
  * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
  * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
  * @param clickTrackingUrl Tracking url for the ad clicks.
  * @param creativeType Ad creative type enum
  * @param destinationUrl Destination URL.
  * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  * @param isPinDeleted Is original pin deleted?
  * @param isRemovable Is pin repinnable?
  * @param name Name of the ad - 255 chars max.
  * @param pinId Pin ID.
  * @param viewTrackingUrl Tracking URL for ad impressions.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AdResponseAllOf(
  adGroupId: Option[String],
  androidDeepLink: Option[String],
  carouselAndroidDeepLinks: Option[List[String]],
  carouselDestinationUrls: Option[List[String]],
  carouselIosDeepLinks: Option[List[String]],
  clickTrackingUrl: Option[String],
  creativeType: Option[AdResponseAllOf.CreativeType.Value],
  destinationUrl: Option[String],
  iosDeepLink: Option[String],
  isPinDeleted: Option[Boolean],
  isRemovable: Option[Boolean],
  name: Option[String],
  pinId: Option[String],
  status: Option[EntityStatus],
  trackingUrls: Option[TrackingUrls],
  viewTrackingUrl: Option[String]
  additionalProperties: 
)

object AdResponseAllOf {
  implicit lazy val adResponseAllOfJsonFormat: Format[AdResponseAllOf] = {
    val realJsonFormat = Json.format[AdResponseAllOf]
    val declaredPropNames = Set("adGroupId", "androidDeepLink", "carouselAndroidDeepLinks", "carouselDestinationUrls", "carouselIosDeepLinks", "clickTrackingUrl", "creativeType", "destinationUrl", "iosDeepLink", "isPinDeleted", "isRemovable", "name", "pinId", "status", "trackingUrls", "viewTrackingUrl")
    
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
      Writes { adResponseAllOf =>
        val jsObj = realJsonFormat.writes(adResponseAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CreativeType extends Enumeration {
    val REGULAR = Value("REGULAR")
    val VIDEO = Value("VIDEO")
    val SHOPPING = Value("SHOPPING")
    val CAROUSEL = Value("CAROUSEL")
    val MAXVIDEO = Value("MAX_VIDEO")
    val SHOPTHEPIN = Value("SHOP_THE_PIN")
    val STORY = Value("STORY")

    type CreativeType = Value
    implicit lazy val CreativeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

