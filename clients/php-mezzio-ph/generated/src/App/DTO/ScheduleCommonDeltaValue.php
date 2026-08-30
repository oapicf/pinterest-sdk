<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ScheduleCommonDeltaValue
{
    /**
     * @DTA\Data(field="age_bucket_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAgeBucketMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAgeBucketMultipliers::class})
     * @var \App\DTO\ScheduleAgeBucketMultipliers|null
     */
    public $age_bucket_multipliers;

    /**
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAppTypeMultipliers::class})
     * @var \App\DTO\ScheduleAppTypeMultipliers|null
     */
    public $app_type_multipliers;

    /**
     * @DTA\Data(field="audience_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAudienceMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAudienceMultipliers::class})
     * @var \App\DTO\ScheduleAudienceMultipliers|null
     */
    public $audience_multipliers;

    /**
     * @DTA\Data(field="gender_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleBidOptionsGenderMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleBidOptionsGenderMultipliers::class})
     * @var \App\DTO\ScheduleBidOptionsGenderMultipliers|null
     */
    public $gender_multipliers;

    /**
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleBidOptionsPlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleBidOptionsPlacementMultipliers::class})
     * @var \App\DTO\ScheduleBidOptionsPlacementMultipliers|null
     */
    public $placement_multipliers;

}
