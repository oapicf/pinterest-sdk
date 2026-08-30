<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupCreate
{
    /**
     * Advertiser ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bid_in_micro_currency = null;

    /**
     * @DTA\Data(field="bid_strategy_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidStrategyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidStrategyType::class})
     */
    public ?\App\DTO\BidStrategyType $bid_strategy_type = null;

    /**
     * @DTA\Data(field="billable_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     */
    public ?\App\DTO\ActionType $billable_event = null;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @DTA\Data(field="budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $budget_in_micro_currency = null;

    /**
     * Campaign ID of the ad group.
     * @DTA\Data(field="campaign_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $campaign_id = null;

    /**
     * oCPM learn mode
     * @DTA\Data(field="conversion_learning_mode_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionLearningModeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionLearningModeType::class})
     */
    public ?\App\DTO\ConversionLearningModeType $conversion_learning_mode_type = null;

    /**
     * Ad group creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
     * @DTA\Data(field="customer_segment_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $customer_segment_id = null;

    /**
     * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
     * @DTA\Data(field="dca_assets", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     */
    public ?mixed $dca_assets = null;

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_time = null;

    /**
     * @DTA\Data(field="ext_features", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdgroupTrackingFeatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdgroupTrackingFeatures::class})
     */
    public ?\App\DTO\AdgroupTrackingFeatures $ext_features = null;

    /**
     * Feed Profile ID associated to the adgroup.
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $feed_profile_id = null;

    /**
     * Ad group ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":18})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
     * @DTA\Data(field="is_creative_optimization", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_creative_optimization = null;

    /**
     * Indicates whether the ad group should use the local inventory.
     * @DTA\Data(field="is_local_inventory", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_local_inventory = null;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @DTA\Data(field="lifetime_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lifetime_frequency_cap = null;

    /**
     * The targeting radius of the local inventory ads in miles.
     * @DTA\Data(field="local_inventory_radius_in_miles", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $local_inventory_radius_in_miles = null;

    /**
     * Ad group name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableOptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableOptimizationGoalMetadata::class})
     */
    public ?\App\DTO\NullableOptimizationGoalMetadata $optimization_goal_metadata = null;

    /**
     * Pinterest Performance+ campaign settings.
     * @DTA\Data(field="performance_plus_campaign_settings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PerformancePlusCampaignSettings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PerformancePlusCampaignSettings::class})
     */
    public ?\App\DTO\PerformancePlusCampaignSettings $performance_plus_campaign_settings = null;

    /**
     * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     */
    public ?\App\DTO\PlacementGroupType $placement_group = null;

    /**
     * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
     * @DTA\Data(field="placement_traffic_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementTrafficType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementTrafficType::class})
     */
    public ?\App\DTO\PlacementTrafficType $placement_traffic_type = null;

    /**
     * Specify if the promotion is applied at ad group or item level
     * @DTA\Data(field="promotion_application_level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromotionApplicationLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromotionApplicationLevel::class})
     */
    public ?\App\DTO\PromotionApplicationLevel $promotion_application_level = null;

    /**
     * Promotion ID. To clear this field, set to null.
     * @DTA\Data(field="promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $promotion_id = null;

    /**
     * Promotion IDs list. To clear this field, set to an empty array [].
     * @DTA\Data(field="promotion_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $promotion_ids = null;

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $start_time = null;

    /**
     * Ad group/entity status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * @DTA\Data(field="summary_status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SummaryStatus::class})
     */
    public ?\App\DTO\SummaryStatus $summary_status = null;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     */
    public ?\App\DTO\TargetingSpecOptimal $targeting_spec = null;

    /**
     * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
     * @DTA\Data(field="targeting_template_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $targeting_template_ids = null;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupTrackingURLs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupTrackingURLs::class})
     */
    public ?\App\DTO\AdGroupTrackingURLs $tracking_urls = null;

    /**
     * Always \&quot;adgroup\&quot;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Ad group last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

    /**
     * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $auto_targeting_enabled = null;

    /**
     * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
     * @DTA\Data(field="bid_multiplier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":10})
     */
    public ?float $bid_multiplier = null;

    /**
     * @DTA\Data(field="budget_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetType::class})
     */
    public ?\App\DTO\BudgetType $budget_type = null;

    /**
     * @DTA\Data(field="pacing_delivery_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PacingDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PacingDeliveryType::class})
     */
    public ?\App\DTO\PacingDeliveryType $pacing_delivery_type = null;

}
