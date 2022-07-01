package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdResponse_allOf_1.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class AdResponseAllOf1(
  adAccountId: Option[String],
  campaignId: Option[String],
  collectionItemsDestinationUrlTemplate: Option[String],
  createdTime: Option[Int],
  id: Option[String],
  rejectedReasons: Option[AdResponseAllOf1.RejectedReasons.Value],
  rejectionLabels: Option[List[String]],
  reviewStatus: Option[AdResponseAllOf1.ReviewStatus.Value],
  `type`: Option[String],
  updatedTime: Option[Int],
  summaryStatus: Option[PinPromotionSummaryStatus]
  additionalProperties: 
)

object AdResponseAllOf1 {
  implicit lazy val adResponseAllOf1JsonFormat: Format[AdResponseAllOf1] = {
    val realJsonFormat = Json.format[AdResponseAllOf1]
    val declaredPropNames = Set("adAccountId", "campaignId", "collectionItemsDestinationUrlTemplate", "createdTime", "id", "rejectedReasons", "rejectionLabels", "reviewStatus", "`type`", "updatedTime", "summaryStatus")
    
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
      Writes { adResponseAllOf1 =>
        val jsObj = realJsonFormat.writes(adResponseAllOf1)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
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

