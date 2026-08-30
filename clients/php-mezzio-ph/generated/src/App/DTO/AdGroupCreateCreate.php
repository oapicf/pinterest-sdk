<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class AdGroupCreateCreate
{
    /**
     * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bid_in_micro_currency;

    /**
     * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
     * @DTA\Data(field="bid_multiplier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":10, "inclusive":true})
     * @var float|null
     */
    public $bid_multiplier;

    /**
     * @DTA\Data(field="bid_strategy_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidStrategyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidStrategyType::class})
     * @var \App\DTO\BidStrategyType|null
     */
    public $bid_strategy_type;

    /**
     * @DTA\Data(field="billable_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     * @var \App\DTO\ActionType|null
     */
    public $billable_event;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @DTA\Data(field="budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $budget_in_micro_currency;

    /**
     * @DTA\Data(field="budget_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetType::class})
     * @var \App\DTO\BudgetType|null
     */
    public $budget_type;

    /**
     * Campaign ID of the ad group.
     * @DTA\Data(field="campaign_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[C]?\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
     * @DTA\Data(field="customer_segment_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $customer_segment_id;

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * @DTA\Data(field="ext_features", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdgroupTrackingFeatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdgroupTrackingFeatures::class})
     * @var \App\DTO\AdgroupTrackingFeatures|null
     */
    public $ext_features;

    /**
     * Feed Profile ID associated to the adgroup.
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $feed_profile_id;

    /**
     * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
     * @DTA\Data(field="is_creative_optimization", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_creative_optimization;

    /**
     * Indicates whether the ad group should use the local inventory.
     * @DTA\Data(field="is_local_inventory", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_local_inventory;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @DTA\Data(field="lifetime_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_frequency_cap;

    /**
     * The targeting radius of the local inventory ads in miles.
     * @DTA\Data(field="local_inventory_radius_in_miles", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $local_inventory_radius_in_miles;

    /**
     * Ad group name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableOptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableOptimizationGoalMetadata::class})
     * @var \App\DTO\NullableOptimizationGoalMetadata|null
     */
    public $optimization_goal_metadata;

    /**
     * @DTA\Data(field="pacing_delivery_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PacingDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PacingDeliveryType::class})
     * @var \App\DTO\PacingDeliveryType|null
     */
    public $pacing_delivery_type;

    /**
     * Pinterest Performance+ campaign settings.
     * @DTA\Data(field="performance_plus_campaign_settings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PerformancePlusCampaignSettings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PerformancePlusCampaignSettings::class})
     * @var \App\DTO\PerformancePlusCampaignSettings|null
     */
    public $performance_plus_campaign_settings;

    /**
     * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     * @var \App\DTO\PlacementGroupType|null
     */
    public $placement_group;

    /**
     * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
     * @DTA\Data(field="placement_traffic_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementTrafficType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementTrafficType::class})
     * @var \App\DTO\PlacementTrafficType|null
     */
    public $placement_traffic_type;

    /**
     * Specify if the promotion is applied at ad group or item level
     * @DTA\Data(field="promotion_application_level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromotionApplicationLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromotionApplicationLevel::class})
     * @var \App\DTO\PromotionApplicationLevel|null
     */
    public $promotion_application_level;

    /**
     * Promotion ID. To clear this field, set to null.
     * @DTA\Data(field="promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $promotion_id;

    /**
     * Promotion IDs list. To clear this field, set to an empty array [].
     * @DTA\Data(field="promotion_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection7::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection7::class})
     * @var \App\DTO\Collection7|null
     */
    public $promotion_ids;

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * Ad group/entity status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @var \App\DTO\TargetingSpecOptimal|null
     */
    public $targeting_spec;

    /**
     * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
     * @DTA\Data(field="targeting_template_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     * @var \App\DTO\Collection22|null
     */
    public $targeting_template_ids;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupTrackingURLs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupTrackingURLs::class})
     * @var \App\DTO\AdGroupTrackingURLs|null
     */
    public $tracking_urls;

}
