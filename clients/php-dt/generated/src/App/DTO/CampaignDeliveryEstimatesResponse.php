<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Delivery estimates response for a campaign.
 */
class CampaignDeliveryEstimatesResponse
{
    /**
     * Estimated curves. Each curve will pertain to a single estimation type.
     * @DTA\Data(field="curves", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection166::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection166::class})
     */
    public ?\App\DTO\Collection166 $curves = null;

    /**
     * @DTA\Data(field="derived_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignDeliveryEstimatesDerivedMetrics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignDeliveryEstimatesDerivedMetrics::class})
     */
    public ?\App\DTO\CampaignDeliveryEstimatesDerivedMetrics $derived_metrics = null;

    /**
     * Maximum potential spend estimate.
     * @DTA\Data(field="max_potential_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_potential_spend = null;

}
