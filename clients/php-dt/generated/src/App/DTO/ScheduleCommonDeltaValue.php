<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ScheduleCommonDeltaValue
{
    /**
     * @DTA\Data(field="age_bucket_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAgeBucketMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAgeBucketMultipliers::class})
     */
    public ?\App\DTO\ScheduleAgeBucketMultipliers $age_bucket_multipliers = null;

    /**
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAppTypeMultipliers::class})
     */
    public ?\App\DTO\ScheduleAppTypeMultipliers $app_type_multipliers = null;

    /**
     * @DTA\Data(field="audience_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAudienceMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAudienceMultipliers::class})
     */
    public ?\App\DTO\ScheduleAudienceMultipliers $audience_multipliers = null;

    /**
     * @DTA\Data(field="gender_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleBidOptionsGenderMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleBidOptionsGenderMultipliers::class})
     */
    public ?\App\DTO\ScheduleBidOptionsGenderMultipliers $gender_multipliers = null;

    /**
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleBidOptionsPlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleBidOptionsPlacementMultipliers::class})
     */
    public ?\App\DTO\ScheduleBidOptionsPlacementMultipliers $placement_multipliers = null;

}
