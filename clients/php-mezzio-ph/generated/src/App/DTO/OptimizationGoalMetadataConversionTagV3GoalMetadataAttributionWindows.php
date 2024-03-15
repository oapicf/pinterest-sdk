<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
{
    /**
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $click_window_days;

    /**
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $engagement_window_days;

    /**
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $view_window_days;

}
