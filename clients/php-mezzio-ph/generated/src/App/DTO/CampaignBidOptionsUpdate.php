<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an update to the campaign level bid multipliers.
 */
class CampaignBidOptionsUpdate
{
    /**
     * Age bucket multipliers for bid adjustments.
     * @DTA\Data(field="age_bucket_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AgeBucketMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AgeBucketMultipliers::class})
     * @var \App\DTO\AgeBucketMultipliers|null
     */
    public $age_bucket_multipliers;

    /**
     * App type multipliers for bid adjustments.
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AppTypeMultipliers::class})
     * @var \App\DTO\AppTypeMultipliers|null
     */
    public $app_type_multipliers;

    /**
     * Audience multipliers for bid adjustments.
     * @DTA\Data(field="audience_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignAudienceMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignAudienceMultipliers::class})
     * @var \App\DTO\CampaignAudienceMultipliers|null
     */
    public $audience_multipliers;

    /**
     * The time window for frequency bid multipliers.
     * @DTA\Data(field="freq_bid_multiplier_time_window", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FreqBidMultiplierTimeWindow::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FreqBidMultiplierTimeWindow::class})
     * @var \App\DTO\FreqBidMultiplierTimeWindow|null
     */
    public $freq_bid_multiplier_time_window;

    /**
     * Frequency multipliers for bid adjustments.
     * @DTA\Data(field="frequency_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FrequencyMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FrequencyMultipliers::class})
     * @var \App\DTO\FrequencyMultipliers|null
     */
    public $frequency_multipliers;

    /**
     * Gender multipliers for bid adjustments.
     * @DTA\Data(field="gender_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenderMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenderMultipliers::class})
     * @var \App\DTO\GenderMultipliers|null
     */
    public $gender_multipliers;

    /**
     * Placement multipliers for bid adjustments.
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementMultipliers::class})
     * @var \App\DTO\PlacementMultipliers|null
     */
    public $placement_multipliers;

    /**
     * List of fields to update. Only the fields in the list will be updated.
     * @DTA\Data(field="update_mask")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignBidOptionsUpdateMaskItems[]|null
     */
    public $update_mask;

}
