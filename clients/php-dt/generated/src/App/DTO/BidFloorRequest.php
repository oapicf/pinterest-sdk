<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BidFloorRequest
{
    /**
     * @DTA\Data(field="bid_floor_specs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     */
    public ?\App\DTO\Collection63 $bid_floor_specs = null;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpec::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpec::class})
     */
    public ?\App\DTO\TargetingSpec $targeting_spec = null;

}
