package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdResponse.
  * @param adGroupId ID of the ad group that contains the ad.
  * @param androidDeepLink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
  * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
  * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
  * @param clickTrackingUrl Tracking url for the ad clicks.
  * @param destinationUrl Destination URL.
  * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  * @param isPinDeleted Is original pin deleted?
  * @param isRemovable Is pin repinnable?
  * @param name Name of the ad - 255 chars max.
  * @param viewTrackingUrl Tracking URL for ad impressions.
  * @param leadFormId Lead form ID for lead ad generation.
  * @param customizableCtaType Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  * @param pinId Pin ID.
  * @param adAccountId The ID of the advertiser that this ad belongs to.
  * @param campaignId ID of the ad campaign that contains this ad.
  * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
  * @param createdTime Pin creation time. Unix timestamp in seconds.
  * @param id The ID of this ad.
  * @param rejectedReasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  * @param rejectionLabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  * @param reviewStatus Ad review status
  * @param `type` Always \"ad\".
  * @param updatedTime Last update time. Unix timestamp in seconds.
  * @param summaryStatus Ad summary status
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdResponse(
  adGroupId: Option[String],
  androidDeepLink: Option[String],
  carouselAndroidDeepLinks: Option[List[String]],
  carouselDestinationUrls: Option[List[String]],
  carouselIosDeepLinks: Option[List[String]],
  clickTrackingUrl: Option[String],
  creativeType: Option[CreativeType],
  destinationUrl: Option[String],
  iosDeepLink: Option[String],
  isPinDeleted: Option[Boolean],
  isRemovable: Option[Boolean],
  name: Option[String],
  status: Option[EntityStatus],
  trackingUrls: Option[AdCommonTrackingUrls],
  viewTrackingUrl: Option[String],
  leadFormId: Option[String],
  gridClickType: Option[GridClickType],
  customizableCtaType: Option[AdResponse.CustomizableCtaType.Value],
  quizPinData: Option[AdCommonQuizPinData],
  pinId: Option[String],
  adAccountId: Option[String],
  campaignId: Option[String],
  collectionItemsDestinationUrlTemplate: Option[String],
  createdTime: Option[Int],
  id: Option[String],
  rejectedReasons: Option[AdResponse.RejectedReasons.Value],
  rejectionLabels: Option[List[String]],
  reviewStatus: Option[AdResponse.ReviewStatus.Value],
  `type`: Option[String],
  updatedTime: Option[Int],
  summaryStatus: Option[PinPromotionSummaryStatus]
  additionalProperties: 
)

object AdResponse {
  implicit lazy val adResponseJsonFormat: Format[AdResponse] = {
    val realJsonFormat = Json.format[AdResponse]
    val declaredPropNames = Set("adGroupId", "androidDeepLink", "carouselAndroidDeepLinks", "carouselDestinationUrls", "carouselIosDeepLinks", "clickTrackingUrl", "creativeType", "destinationUrl", "iosDeepLink", "isPinDeleted", "isRemovable", "name", "status", "trackingUrls", "viewTrackingUrl", "leadFormId", "gridClickType", "customizableCtaType", "quizPinData", "pinId", "adAccountId", "campaignId", "collectionItemsDestinationUrlTemplate", "createdTime", "id", "rejectedReasons", "rejectionLabels", "reviewStatus", "`type`", "updatedTime", "summaryStatus")
    
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
      Writes { adResponse =>
        val jsObj = realJsonFormat.writes(adResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CustomizableCtaType extends Enumeration {
    val GETOFFER = Value("GET_OFFER")
    val LEARNMORE = Value("LEARN_MORE")
    val ORDERNOW = Value("ORDER_NOW")
    val SHOPNOW = Value("SHOP_NOW")
    val SIGNUP = Value("SIGN_UP")
    val SUBSCRIBE = Value("SUBSCRIBE")
    val BUYNOW = Value("BUY_NOW")
    val CONTACTUS = Value("CONTACT_US")
    val GETQUOTE = Value("GET_QUOTE")
    val VISITWEBSITE = Value("VISIT_WEBSITE")
    val APPLYNOW = Value("APPLY_NOW")
    val BOOKNOW = Value("BOOK_NOW")
    val REQUESTDEMO = Value("REQUEST_DEMO")
    val REGISTERNOW = Value("REGISTER_NOW")
    val FINDADEALER = Value("FIND_A_DEALER")
    val ADDTOCART = Value("ADD_TO_CART")
    val WATCHNOW = Value("WATCH_NOW")
    val READMORE = Value("READ_MORE")
    val Null = Value("null")

    type CustomizableCtaType = Value
    implicit lazy val CustomizableCtaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object RejectedReasons extends Enumeration {
    val HASHTAGS = Value("HASHTAGS")
    val PROMOTIONSANDPRICES = Value("PROMOTIONS_AND_PRICES")
    val TARGETING = Value("TARGETING")
    val LANDINGPAGE = Value("LANDING_PAGE")
    val CAPSANDSYMBOLS = Value("CAPS_AND_SYMBOLS")
    val SHOCKING = Value("SHOCKING")
    val WEIGHTLOSS = Value("WEIGHT_LOSS")
    val PROHIBITEDPRODUCT = Value("PROHIBITED_PRODUCT")
    val AUTHENTICITY = Value("AUTHENTICITY")
    val NUDITY = Value("NUDITY")
    val CONFUSINGDESIGN = Value("CONFUSING_DESIGN")
    val URGENCY = Value("URGENCY")
    val RATINGS = Value("RATINGS")
    val APP = Value("APP")
    val ALCOHOL = Value("ALCOHOL")
    val CONTESTS = Value("CONTESTS")
    val POLITICAL = Value("POLITICAL")
    val OTHER = Value("OTHER")
    val IMAGE = Value("IMAGE")
    val NAR = Value("NAR")
    val INCONSISTENT = Value("INCONSISTENT")
    val CLICKBAIT = Value("CLICKBAIT")
    val NODESCRIPTION = Value("NO_DESCRIPTION")
    val LOWQUALITY = Value("LOW_QUALITY")
    val EXAGGERATEDCLAIMS = Value("EXAGGERATED_CLAIMS")
    val PINTERESTBRAND = Value("PINTEREST_BRAND")
    val ALCOHOLNOSALE = Value("ALCOHOL_NO_SALE")
    val LANDINGPAGESPEED = Value("LANDING_PAGE_SPEED")
    val LANDINGPAGEHARDWALL = Value("LANDING_PAGE_HARDWALL")
    val LANDINGPAGEBROKEN = Value("LANDING_PAGE_BROKEN")
    val LANDINGPAGEQUALITY = Value("LANDING_PAGE_QUALITY")
    val OUTOFSTOCK = Value("OUT_OF_STOCK")
    val IMAGELOWQUALITY = Value("IMAGE_LOW_QUALITY")
    val IMAGEBUSY = Value("IMAGE_BUSY")
    val IMAGEPOORLYEDITED = Value("IMAGE_POORLY_EDITED")
    val IMAGEBEFOREAFTER = Value("IMAGE_BEFORE_AFTER")
    val UGC = Value("UGC")
    val FAKEBUTTONS = Value("FAKE_BUTTONS")
    val WEAPONS = Value("WEAPONS")
    val SENSITIVE = Value("SENSITIVE")
    val UNACCEPTABLEBUSINESS = Value("UNACCEPTABLE_BUSINESS")
    val SUSPICIOUSCLAIMS = Value("SUSPICIOUS_CLAIMS")
    val PHARMA = Value("PHARMA")
    val SUSPICIOUSSUPPLEMENTS = Value("SUSPICIOUS_SUPPLEMENTS")
    val ILLEGALRECREATIONALDRUG = Value("ILLEGAL_RECREATIONAL_DRUG")
    val LOWQUALITYLANDINGPAGE = Value("LOW_QUALITY_LANDING_PAGE")
    val RESTRICTEDHEALTHCARE = Value("RESTRICTED_HEALTHCARE")
    val INCONSISTENTLANGFR = Value("INCONSISTENT_LANG_FR")

    type RejectedReasons = Value
    implicit lazy val RejectedReasonsJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ReviewStatus extends Enumeration {
    val OTHER = Value("OTHER")
    val PENDING = Value("PENDING")
    val REJECTED = Value("REJECTED")
    val APPROVED = Value("APPROVED")

    type ReviewStatus = Value
    implicit lazy val ReviewStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

