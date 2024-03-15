<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OptimizationGoalMetadataConversionTagV3GoalMetadata
{
    /**
     * @DTA\Data(field="attribution_windows", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows::class})
     */
    public ?\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows $attribution_windows = null;

    /**
     * @DTA\Data(field="conversion_event", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $conversion_event = null;

    /**
     * @DTA\Data(field="conversion_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[0-9]+$/"})
     */
    public ?string $conversion_tag_id = null;

    /**
     * @DTA\Data(field="cpa_goal_value_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[0-9]+$/"})
     */
    public ?string $cpa_goal_value_in_micro_currency = null;

    /**
     * Ad group is ROAS optimized
     * @DTA\Data(field="is_roas_optimized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_roas_optimized = null;

    /**
     * Conversion learning model type
     * @DTA\Data(field="learning_mode_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $learning_mode_type = null;

}
