package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdUpdateRequest.
  * @param id The ID of this ad.
  * @param pinId Pin ID. This field may only be updated for draft ads.
  * @param adGroupId ID of the ad group that contains the ad.
  * @param androidDeepLink Deep link URL for Android devices.
  * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
  * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
  * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
  * @param clickTrackingUrl Tracking url for the ad clicks.
  * @param destinationUrl Destination URL.
  * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  * @param iosDeepLink Deep link URL for iOS devices.
  * @param isCarting Is the ad a carting/WTB ad?
  * @param isPinDeleted Is original pin deleted?
  * @param isRemovable Is pin repinnable?
  * @param leadFormId Lead form ID for lead ad generation.
  * @param name Name of the ad - 255 chars max.
  * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  * @param viewTrackingUrl Tracking URL for ad impressions.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdUpdateRequest(
  id: String,
  pinId: Option[String],
  adGroupId: Option[String],
  androidDeepLink: Option[String],
  carouselAndroidDeepLinks: Option[List[String]],
  carouselDestinationUrls: Option[List[String]],
  carouselIosDeepLinks: Option[List[String]],
  clickTrackingUrl: Option[String],
  creativeType: Option[CreativeType],
  customizableCtaType: Option[CustomizableCTAType],
  destinationUrl: Option[String],
  disclosureType: Option[DisclosureType],
  disclosureUrl: Option[String],
  gridClickType: Option[GridClickType],
  iosDeepLink: Option[String],
  isCarting: Option[Boolean],
  isPinDeleted: Option[Boolean],
  isRemovable: Option[Boolean],
  leadFormId: Option[String],
  name: Option[String],
  quizPinData: Option[JsObject],
  status: Option[EntityStatus],
  trackingUrls: Option[JsObject],
  viewTrackingUrl: Option[String]
  additionalProperties: 
)

object AdUpdateRequest {
  implicit lazy val adUpdateRequestJsonFormat: Format[AdUpdateRequest] = {
    val realJsonFormat = Json.format[AdUpdateRequest]
    val declaredPropNames = Set("id", "pinId", "adGroupId", "androidDeepLink", "carouselAndroidDeepLinks", "carouselDestinationUrls", "carouselIosDeepLinks", "clickTrackingUrl", "creativeType", "customizableCtaType", "destinationUrl", "disclosureType", "disclosureUrl", "gridClickType", "iosDeepLink", "isCarting", "isPinDeleted", "isRemovable", "leadFormId", "name", "quizPinData", "status", "trackingUrls", "viewTrackingUrl")
    
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
      Writes { adUpdateRequest =>
        val jsObj = realJsonFormat.writes(adUpdateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

