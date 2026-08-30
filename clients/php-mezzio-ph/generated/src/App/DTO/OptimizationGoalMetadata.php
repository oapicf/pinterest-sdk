<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OptimizationGoalMetadata
{
    /**
     * @DTA\Data(field="conversion_tag_v3_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagV3GoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagV3GoalMetadata::class})
     * @var \App\DTO\ConversionTagV3GoalMetadata|null
     */
    public $conversion_tag_v3_goal_metadata;

    /**
     * @DTA\Data(field="frequency_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FrequencyGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FrequencyGoalMetadata::class})
     * @var \App\DTO\FrequencyGoalMetadata|null
     */
    public $frequency_goal_metadata;

    /**
     * @DTA\Data(field="scrollup_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollupGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollupGoalMetadata::class})
     * @var \App\DTO\ScrollupGoalMetadata|null
     */
    public $scrollup_goal_metadata;

}
