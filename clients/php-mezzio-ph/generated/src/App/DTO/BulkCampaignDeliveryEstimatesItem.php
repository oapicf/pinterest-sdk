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
     * @var \App\DTO\CampaignPlanningAdGroupAudienceSize[]|null
     */
    public $adgroup_audience_sizes;

    /**
     * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
     * @DTA\Data(field="conversion_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $conversion_rate;

    /**
     * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
     * @DTA\Data(field="conversion_rates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignPlanningConversionRate[]|null
     */
    public $conversion_rates;

    /**
     * Estimated curves. Each curve will pertain to a single estimation type.
     * @DTA\Data(field="curves", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignPlanningCurveEstimate[]|null
     */
    public $curves;

    /**
     * @DTA\Data(field="derived_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignDeliveryEstimatesDerivedMetrics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignDeliveryEstimatesDerivedMetrics::class})
     * @var \App\DTO\CampaignDeliveryEstimatesDerivedMetrics|null
     */
    public $derived_metrics;

    /**
     * Errors encountered during estimation for this campaign.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignPlanningResponseError[]|null
     */
    public $errors;

    /**
     * UUID used to track delivery estimates when they are generated as part of a saved campaign.
     * @DTA\Data(field="estimate_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $estimate_id;

    /**
     * Maximum potential spend estimate.
     * @DTA\Data(field="max_potential_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_potential_spend;

}
