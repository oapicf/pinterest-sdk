<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
class BidOptionsAppTypeMultipliers
{
    /**
     * @DTA\Data(field="android_mobile", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $android_mobile = null;

    /**
     * @DTA\Data(field="android_tablet", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $android_tablet = null;

    /**
     * @DTA\Data(field="ipad", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $ipad = null;

    /**
     * @DTA\Data(field="iphone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $iphone = null;

    /**
     * @DTA\Data(field="web", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $web = null;

    /**
     * @DTA\Data(field="web_mobile", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $web_mobile = null;

}
