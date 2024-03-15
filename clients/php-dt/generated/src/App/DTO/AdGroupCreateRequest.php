<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupCreateRequest
{
    /**
     * Ad group name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Ad group/entity status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @DTA\Data(field="budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $budget_in_micro_currency = null;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bid_in_micro_currency = null;

    /**
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupCommonOptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupCommonOptimizationGoalMetadata::class})
     */
    public ?\App\DTO\AdGroupCommonOptimizationGoalMetadata $optimization_goal_metadata = null;

    /**
     * @DTA\Data(field="budget_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetType::class})
     */
    public ?\App\DTO\BudgetType $budget_type = null;

    /**
     * Ad group start time. Unix timestamp in seconds. Defaults to current time.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $start_time = null;

    /**
     * Ad group end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_time = null;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpec::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpec::class})
     */
    public ?\App\DTO\TargetingSpec $targeting_spec = null;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @DTA\Data(field="lifetime_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lifetime_frequency_cap = null;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupCommonTrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupCommonTrackingUrls::class})
     */
    public ?\App\DTO\AdGroupCommonTrackingUrls $tracking_urls = null;

    /**
     * Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $auto_targeting_enabled = null;

    /**
     * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     */
    public ?\App\DTO\PlacementGroupType $placement_group = null;

    /**
     * @DTA\Data(field="pacing_delivery_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PacingDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PacingDeliveryType::class})
     */
    public ?\App\DTO\PacingDeliveryType $pacing_delivery_type = null;

    /**
     * Campaign ID of the ad group.
     * @DTA\Data(field="campaign_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $campaign_id = null;

    /**
     * @DTA\Data(field="billable_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     */
    public ?\App\DTO\ActionType $billable_event = null;

    /**
     * Bid strategy type
     * @DTA\Data(field="bid_strategy_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bid_strategy_type = null;

}
