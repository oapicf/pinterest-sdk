<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Attribution windows for a conversion event.
 */
class CampaignPlanningConversionAttribution
{
    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConversionAttributionWindowDays::class})
     */
    public ?\App\DTO\CampaignPlanningConversionAttributionWindowDays $click_window_days = null;

    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConversionAttributionWindowDays::class})
     */
    public ?\App\DTO\CampaignPlanningConversionAttributionWindowDays $engagement_window_days = null;

    /**
     * Number of days to use as the conversion attribution window for a view action.
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConversionAttributionWindowDays::class})
     */
    public ?\App\DTO\CampaignPlanningConversionAttributionWindowDays $view_window_days = null;

}
