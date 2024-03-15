<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OptimizationGoalMetadataConversionTagV3GoalMetadata
{
    /**
     * @DTA\Data(field="attribution_windows", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows::class})
     * @var \App\DTO\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows|null
     */
    public $attribution_windows;

    /**
     * @DTA\Data(field="conversion_event", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $conversion_event;

    /**
     * @DTA\Data(field="conversion_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[0-9]+$/"})
     * @var string|null
     */
    public $conversion_tag_id;

    /**
     * @DTA\Data(field="cpa_goal_value_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[0-9]+$/"})
     * @var string|null
     */
    public $cpa_goal_value_in_micro_currency;

    /**
     * Ad group is ROAS optimized
     * @DTA\Data(field="is_roas_optimized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_roas_optimized;

    /**
     * Conversion learning model type
     * @DTA\Data(field="learning_mode_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $learning_mode_type;

}
