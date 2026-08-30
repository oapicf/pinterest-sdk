<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class BidFloorCreate
{
    /**
     * List of bid floor specifications.
     * @DTA\Data(field="bid_floor_specs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection115::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection115::class})
     * @var \App\DTO\Collection115|null
     */
    public $bid_floor_specs;

    /**
     * Ad group targeting specification defining the ad group target audience.
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @var \App\DTO\TargetingSpecOptimal|null
     */
    public $targeting_spec;

}
