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
     */
    public ?bool $auto_targeting_enabled = null;

    /**
     * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @DTA\Data(field="creative_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection160::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection160::class})
     */
    public ?\App\DTO\Collection160 $creative_types = null;

    /**
     * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection161::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection161::class})
     */
    public ?\App\DTO\Collection161 $keywords = null;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
     * @DTA\Data(field="monthly_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $monthly_frequency_cap = null;

    /**
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     */
    public ?\App\DTO\OptimizationGoalMetadata $optimization_goal_metadata = null;

    /**
     * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
     * @DTA\Data(field="optimization_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationType::class})
     */
    public ?\App\DTO\OptimizationType $optimization_type = null;

    /**
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     */
    public ?\App\DTO\PlacementGroupType $placement_group = null;

    /**
     * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection162::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection162::class})
     */
    public ?\App\DTO\Collection162 $product_group_ids = null;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     */
    public ?\App\DTO\TargetingSpecOptimal $targeting_spec = null;

}
