<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
{
    /**
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $click_window_days = null;

    /**
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $engagement_window_days = null;

    /**
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $view_window_days = null;

}
