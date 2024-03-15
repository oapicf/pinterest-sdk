<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
 */
class AdGroupCommonOptimizationGoalMetadata
{
    /**
     * @DTA\Data(field="conversion_tag_v3_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadata::class})
     */
    public ?\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadata $conversion_tag_v3_goal_metadata = null;

    /**
     * @DTA\Data(field="frequency_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadataFrequencyGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadataFrequencyGoalMetadata::class})
     */
    public ?\App\DTO\OptimizationGoalMetadataFrequencyGoalMetadata $frequency_goal_metadata = null;

    /**
     * @DTA\Data(field="scrollup_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadataScrollupGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadataScrollupGoalMetadata::class})
     */
    public ?\App\DTO\OptimizationGoalMetadataScrollupGoalMetadata $scrollup_goal_metadata = null;

}
