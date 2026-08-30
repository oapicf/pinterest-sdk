<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NullableOptimizationGoalMetadata
{
    /**
     * @DTA\Data(field="conversion_tag_v3_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagV3GoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagV3GoalMetadata::class})
     */
    public ?\App\DTO\ConversionTagV3GoalMetadata $conversion_tag_v3_goal_metadata = null;

    /**
     * @DTA\Data(field="frequency_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FrequencyGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FrequencyGoalMetadata::class})
     */
    public ?\App\DTO\FrequencyGoalMetadata $frequency_goal_metadata = null;

    /**
     * @DTA\Data(field="scrollup_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollupGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollupGoalMetadata::class})
     */
    public ?\App\DTO\ScrollupGoalMetadata $scrollup_goal_metadata = null;

}
