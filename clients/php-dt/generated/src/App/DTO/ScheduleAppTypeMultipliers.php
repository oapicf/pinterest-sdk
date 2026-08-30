<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
class ScheduleAppTypeMultipliers
{
    /**
     * @DTA\Data(field="APP_TYPE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecAppType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecAppType::class})
     */
    public ?\App\DTO\TargetingSpecAppType $app_type = null;

}
