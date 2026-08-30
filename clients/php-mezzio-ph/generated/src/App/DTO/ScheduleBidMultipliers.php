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
     * @var \App\DTO\BidOptionsAgeBucketMultipliers|null
     */
    public $age_bucket_multipliers;

    /**
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsAppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsAppTypeMultipliers::class})
     * @var \App\DTO\BidOptionsAppTypeMultipliers|null
     */
    public $app_type_multipliers;

    /**
     * @DTA\Data(field="audience_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\BidOptionsAudienceMultipliers[]|null
     */
    public $audience_multipliers;

    /**
     * @DTA\Data(field="gender_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsGenderMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsGenderMultipliers::class})
     * @var \App\DTO\BidOptionsGenderMultipliers|null
     */
    public $gender_multipliers;

    /**
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidOptionsPlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidOptionsPlacementMultipliers::class})
     * @var \App\DTO\BidOptionsPlacementMultipliers|null
     */
    public $placement_multipliers;

}
