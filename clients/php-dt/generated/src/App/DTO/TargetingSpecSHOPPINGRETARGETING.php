<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TargetingSpecSHOPPINGRETARGETING
{
    /**
     * Number of days ago to start lookback timeframe for dynamic retargeting
     * @DTA\Data(field="lookback_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lookback_window = null;

    /**
     * Event types to target for dynamic retargeting
     * @DTA\Data(field="tag_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection26::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection26::class})
     */
    public ?\App\DTO\Collection26 $tag_types = null;

    /**
     * Number of days ago to stop lookback timeframe for dynamic retargeting
     * @DTA\Data(field="exclusion_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $exclusion_window = null;

}
