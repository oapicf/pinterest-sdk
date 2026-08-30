<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 */
class ScheduleBidMultipliers
{
    /**
     * @DTA\Data(field="age_bucket_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsAgeBucketMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsAgeBucketMultipliers::class})
     */
    public ?\App\DTO\BidOptionsAgeBucketMultipliers $age_bucket_multipliers = null;

    /**
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsAppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsAppTypeMultipliers::class})
     */
    public ?\App\DTO\BidOptionsAppTypeMultipliers $app_type_multipliers = null;

    /**
     * @DTA\Data(field="audience_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $audience_multipliers = null;

    /**
     * @DTA\Data(field="gender_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsGenderMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsGenderMultipliers::class})
     */
    public ?\App\DTO\BidOptionsGenderMultipliers $gender_multipliers = null;

    /**
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsPlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsPlacementMultipliers::class})
     */
    public ?\App\DTO\BidOptionsPlacementMultipliers $placement_multipliers = null;

}
