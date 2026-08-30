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
     */
    public ?\App\DTO\Collection115 $bid_floor_specs = null;

    /**
     * Ad group targeting specification defining the ad group target audience.
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     */
    public ?\App\DTO\TargetingSpecOptimal $targeting_spec = null;

}
