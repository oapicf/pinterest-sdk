<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad group configuration for delivery estimates.
 */
class AdGroupDeliveryEstimates
{
    /**
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @DTA\Data(field="creative_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection160::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection160::class})
     * @var \App\DTO\Collection160|null
     */
    public $creative_types;

    /**
     * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection161::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection161::class})
     * @var \App\DTO\Collection161|null
     */
    public $keywords;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
     * @DTA\Data(field="monthly_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $monthly_frequency_cap;

    /**
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @var \App\DTO\OptimizationGoalMetadata|null
     */
    public $optimization_goal_metadata;

    /**
     * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
     * @DTA\Data(field="optimization_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationType::class})
     * @var \App\DTO\OptimizationType|null
     */
    public $optimization_type;

    /**
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     * @var \App\DTO\PlacementGroupType|null
     */
    public $placement_group;

    /**
     * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection162::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection162::class})
     * @var \App\DTO\Collection162|null
     */
    public $product_group_ids;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @var \App\DTO\TargetingSpecOptimal|null
     */
    public $targeting_spec;

}
