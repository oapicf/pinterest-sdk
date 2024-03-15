<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdGroupUpdateRequest
{
    /**
     * Ad group name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Ad group/entity status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @DTA\Data(field="budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $budget_in_micro_currency;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bid_in_micro_currency;

    /**
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupCommonOptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupCommonOptimizationGoalMetadata::class})
     * @var \App\DTO\AdGroupCommonOptimizationGoalMetadata|null
     */
    public $optimization_goal_metadata;

    /**
     * @DTA\Data(field="budget_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetType::class})
     * @var \App\DTO\BudgetType|null
     */
    public $budget_type;

    /**
     * Ad group start time. Unix timestamp in seconds. Defaults to current time.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * Ad group end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpec::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpec::class})
     * @var \App\DTO\TargetingSpec|null
     */
    public $targeting_spec;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @DTA\Data(field="lifetime_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_frequency_cap;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupCommonTrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupCommonTrackingUrls::class})
     * @var \App\DTO\AdGroupCommonTrackingUrls|null
     */
    public $tracking_urls;

    /**
     * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     * @var \App\DTO\PlacementGroupType|null
     */
    public $placement_group;

    /**
     * @DTA\Data(field="pacing_delivery_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PacingDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PacingDeliveryType::class})
     * @var \App\DTO\PacingDeliveryType|null
     */
    public $pacing_delivery_type;

    /**
     * Campaign ID of the ad group.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[C]?\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * @DTA\Data(field="billable_event", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     * @var \App\DTO\ActionType|null
     */
    public $billable_event;

    /**
     * Bid strategy type
     * @DTA\Data(field="bid_strategy_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $bid_strategy_type;

    /**
     * Ad group ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

}
