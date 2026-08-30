<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing the campaign level bid multipliers.
 */
class CampaignBidOptions
{
    /**
     * Age bucket multipliers for bid adjustments.
     * @DTA\Data(field="age_bucket_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AgeBucketMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AgeBucketMultipliers::class})
     */
    public ?\App\DTO\AgeBucketMultipliers $age_bucket_multipliers = null;

    /**
     * App type multipliers for bid adjustments.
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AppTypeMultipliers::class})
     */
    public ?\App\DTO\AppTypeMultipliers $app_type_multipliers = null;

    /**
     * Audience multipliers for bid adjustments.
     * @DTA\Data(field="audience_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignAudienceMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignAudienceMultipliers::class})
     */
    public ?\App\DTO\CampaignAudienceMultipliers $audience_multipliers = null;

    /**
     * The time window for frequency bid multipliers.
     * @DTA\Data(field="freq_bid_multiplier_time_window", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FreqBidMultiplierTimeWindow::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FreqBidMultiplierTimeWindow::class})
     */
    public ?\App\DTO\FreqBidMultiplierTimeWindow $freq_bid_multiplier_time_window = null;

    /**
     * Frequency multipliers for bid adjustments.
     * @DTA\Data(field="frequency_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FrequencyMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FrequencyMultipliers::class})
     */
    public ?\App\DTO\FrequencyMultipliers $frequency_multipliers = null;

    /**
     * Gender multipliers for bid adjustments.
     * @DTA\Data(field="gender_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenderMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenderMultipliers::class})
     */
    public ?\App\DTO\GenderMultipliers $gender_multipliers = null;

    /**
     * Placement multipliers for bid adjustments.
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementMultipliers::class})
     */
    public ?\App\DTO\PlacementMultipliers $placement_multipliers = null;

}
