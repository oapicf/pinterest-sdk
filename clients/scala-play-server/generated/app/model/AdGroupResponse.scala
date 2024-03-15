package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupResponse.
  * @param name Ad group name.
  * @param status Ad group/entity status.
  * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
  * @param endTime Ad group end time. Unix timestamp in seconds.
  * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param placementGroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  * @param campaignId Campaign ID of the ad group.
  * @param bidStrategyType Bid strategy type
  * @param id Ad group ID.
  * @param adAccountId Advertiser ID.
  * @param createdTime Ad group creation time. Unix timestamp in seconds.
  * @param updatedTime Ad group last update time. Unix timestamp in seconds.
  * @param `type` Always \"adgroup\".
  * @param conversionLearningModeType oCPM learn mode
  * @param summaryStatus Ad group summary status.
  * @param feedProfileId Feed Profile ID associated to the adgroup.
  * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupResponse(
  name: Option[String],
  status: Option[EntityStatus],
  budgetInMicroCurrency: Option[Int],
  bidInMicroCurrency: Option[Int],
  optimizationGoalMetadata: Option[AdGroupCommonOptimizationGoalMetadata],
  budgetType: Option[BudgetType],
  startTime: Option[Int],
  endTime: Option[Int],
  targetingSpec: Option[TargetingSpec],
  lifetimeFrequencyCap: Option[Int],
  trackingUrls: Option[AdGroupCommonTrackingUrls],
  autoTargetingEnabled: Option[Boolean],
  placementGroup: Option[PlacementGroupType],
  pacingDeliveryType: Option[PacingDeliveryType],
  campaignId: Option[String],
  billableEvent: Option[ActionType],
  bidStrategyType: Option[AdGroupResponse.BidStrategyType.Value],
  id: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String],
  conversionLearningModeType: Option[AdGroupResponse.ConversionLearningModeType.Value],
  summaryStatus: Option[AdGroupSummaryStatus],
  feedProfileId: Option[String],
  dcaAssets: Option[OasAnyTypeNotMapped]
  additionalProperties: 
)

object AdGroupResponse {
  implicit lazy val adGroupResponseJsonFormat: Format[AdGroupResponse] = {
    val realJsonFormat = Json.format[AdGroupResponse]
    val declaredPropNames = Set("name", "status", "budgetInMicroCurrency", "bidInMicroCurrency", "optimizationGoalMetadata", "budgetType", "startTime", "endTime", "targetingSpec", "lifetimeFrequencyCap", "trackingUrls", "autoTargetingEnabled", "placementGroup", "pacingDeliveryType", "campaignId", "billableEvent", "bidStrategyType", "id", "adAccountId", "createdTime", "updatedTime", "`type`", "conversionLearningModeType", "summaryStatus", "feedProfileId", "dcaAssets")
    
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
      Writes { adGroupResponse =>
        val jsObj = realJsonFormat.writes(adGroupResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object BidStrategyType extends Enumeration {
    val AUTOMATICBID = Value("AUTOMATIC_BID")
    val MAXBID = Value("MAX_BID")
    val TARGETAVG = Value("TARGET_AVG")
    val Null = Value("null")

    type BidStrategyType = Value
    implicit lazy val BidStrategyTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ConversionLearningModeType extends Enumeration {
    val NOTACTIVE = Value("NOT_ACTIVE")
    val ACTIVE = Value("ACTIVE")
    val Null = Value("null")

    type ConversionLearningModeType = Value
    implicit lazy val ConversionLearningModeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

