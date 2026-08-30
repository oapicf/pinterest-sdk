<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Derived metrics for an ad campaign.
 */
class CampaignDeliveryEstimatesDerivedMetrics
{
    /**
     * Estimated cost per click.
     * @DTA\Data(field="cpc", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cpc = null;

    /**
     * Lower estimate of the cost per click.
     * @DTA\Data(field="cpc_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cpc_lower = null;

    /**
     * Upper estimate of the cost per click.
     * @DTA\Data(field="cpc_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cpc_upper = null;

    /**
     * Estimated cost per thousand impressions.
     * @DTA\Data(field="cpm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cpm = null;

    /**
     * Lower estimate of cost per thousand impressions.
     * @DTA\Data(field="cpm_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cpm_lower = null;

    /**
     * Upper estimate of cost per thousand impressions.
     * @DTA\Data(field="cpm_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cpm_upper = null;

    /**
     * Estimated lifetime frequency.
     * @DTA\Data(field="lifetime_frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_frequency = null;

    /**
     * Lower estimate of lifetime frequency.
     * @DTA\Data(field="lifetime_frequency_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_frequency_lower = null;

    /**
     * Upper estimate of lifetime frequency.
     * @DTA\Data(field="lifetime_frequency_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_frequency_upper = null;

    /**
     * Estimated lifetime impressions.
     * @DTA\Data(field="lifetime_impression", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_impression = null;

    /**
     * Lower estimate of lifetime impressions.
     * @DTA\Data(field="lifetime_impression_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_impression_lower = null;

    /**
     * Upper estimate of lifetime impressions.
     * @DTA\Data(field="lifetime_impression_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_impression_upper = null;

    /**
     * Estimated lifetime reach.
     * @DTA\Data(field="lifetime_reach", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_reach = null;

    /**
     * Lower estimate of lifetime reach.
     * @DTA\Data(field="lifetime_reach_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_reach_lower = null;

    /**
     * Upper estimate of lifetime reach.
     * @DTA\Data(field="lifetime_reach_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lifetime_reach_upper = null;

    /**
     * Estimated weekly clicks.
     * @DTA\Data(field="weekly_click", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_click = null;

    /**
     * Lower estimate of weekly clicks.
     * @DTA\Data(field="weekly_click_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_click_lower = null;

    /**
     * Upper estimate of weekly clicks.
     * @DTA\Data(field="weekly_click_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_click_upper = null;

    /**
     * Estimated weekly frequency.
     * @DTA\Data(field="weekly_frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_frequency = null;

    /**
     * Lower estimate of weekly frequency.
     * @DTA\Data(field="weekly_frequency_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_frequency_lower = null;

    /**
     * Upper estimate of weekly frequency.
     * @DTA\Data(field="weekly_frequency_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_frequency_upper = null;

    /**
     * Estimated weekly impressions.
     * @DTA\Data(field="weekly_impression", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_impression = null;

    /**
     * Lower estimate of weekly impressions.
     * @DTA\Data(field="weekly_impression_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_impression_lower = null;

    /**
     * Upper estimate of weekly impressions.
     * @DTA\Data(field="weekly_impression_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_impression_upper = null;

    /**
     * Estimated weekly reach.
     * @DTA\Data(field="weekly_reach", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_reach = null;

    /**
     * Lower estimate of weekly reach.
     * @DTA\Data(field="weekly_reach_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_reach_lower = null;

    /**
     * Upper estimate of weekly reach.
     * @DTA\Data(field="weekly_reach_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weekly_reach_upper = null;

}
