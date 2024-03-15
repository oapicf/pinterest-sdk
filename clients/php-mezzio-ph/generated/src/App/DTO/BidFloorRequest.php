<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BidFloorRequest
{
    /**
     * @DTA\Data(field="bid_floor_specs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     * @var \App\DTO\Collection63|null
     */
    public $bid_floor_specs;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpec::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpec::class})
     * @var \App\DTO\TargetingSpec|null
     */
    public $targeting_spec;

}
