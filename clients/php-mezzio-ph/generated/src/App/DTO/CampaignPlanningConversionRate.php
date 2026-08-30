<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */
class CampaignPlanningConversionRate
{
    /**
     * @DTA\Data(field="attribution_windows")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConversionAttribution::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConversionAttribution::class})
     * @var \App\DTO\CampaignPlanningConversionAttribution|null
     */
    public $attribution_windows;

    /**
     * @DTA\Data(field="conversion_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConversionEvent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConversionEvent::class})
     * @var \App\DTO\CampaignPlanningConversionEvent|null
     */
    public $conversion_event;

    /**
     * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
     * @DTA\Data(field="conversion_rate")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $conversion_rate;

}
