<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Delivery estimate result for a single campaign within a bulk request.
 */
class BulkCampaignDeliveryEstimatesItem
{
    /**
     * Range audience sizes for each ad group, in the same order as the ad groups in the request.
     * @DTA\Data(field="adgroup_audience_sizes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $adgroup_audience_sizes = null;

    /**
     * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
     * @DTA\Data(field="conversion_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $conversion_rate = null;

    /**
     * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
     * @DTA\Data(field="conversion_rates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $conversion_rates = null;

    /**
     * Estimated curves. Each curve will pertain to a single estimation type.
     * @DTA\Data(field="curves", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $curves = null;

    /**
     * @DTA\Data(field="derived_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignDeliveryEstimatesDerivedMetrics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignDeliveryEstimatesDerivedMetrics::class})
     */
    public ?\App\DTO\CampaignDeliveryEstimatesDerivedMetrics $derived_metrics = null;

    /**
     * Errors encountered during estimation for this campaign.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $errors = null;

    /**
     * UUID used to track delivery estimates when they are generated as part of a saved campaign.
     * @DTA\Data(field="estimate_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $estimate_id = null;

    /**
     * Maximum potential spend estimate.
     * @DTA\Data(field="max_potential_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_potential_spend = null;

}
