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
     * @var float|null
     */
    public $cpc;

    /**
     * Lower estimate of the cost per click.
     * @DTA\Data(field="cpc_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cpc_lower;

    /**
     * Upper estimate of the cost per click.
     * @DTA\Data(field="cpc_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cpc_upper;

    /**
     * Estimated cost per thousand impressions.
     * @DTA\Data(field="cpm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cpm;

    /**
     * Lower estimate of cost per thousand impressions.
     * @DTA\Data(field="cpm_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cpm_lower;

    /**
     * Upper estimate of cost per thousand impressions.
     * @DTA\Data(field="cpm_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cpm_upper;

    /**
     * Estimated lifetime frequency.
     * @DTA\Data(field="lifetime_frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_frequency;

    /**
     * Lower estimate of lifetime frequency.
     * @DTA\Data(field="lifetime_frequency_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_frequency_lower;

    /**
     * Upper estimate of lifetime frequency.
     * @DTA\Data(field="lifetime_frequency_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_frequency_upper;

    /**
     * Estimated lifetime impressions.
     * @DTA\Data(field="lifetime_impression", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_impression;

    /**
     * Lower estimate of lifetime impressions.
     * @DTA\Data(field="lifetime_impression_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_impression_lower;

    /**
     * Upper estimate of lifetime impressions.
     * @DTA\Data(field="lifetime_impression_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_impression_upper;

    /**
     * Estimated lifetime reach.
     * @DTA\Data(field="lifetime_reach", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_reach;

    /**
     * Lower estimate of lifetime reach.
     * @DTA\Data(field="lifetime_reach_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_reach_lower;

    /**
     * Upper estimate of lifetime reach.
     * @DTA\Data(field="lifetime_reach_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lifetime_reach_upper;

    /**
     * Estimated weekly clicks.
     * @DTA\Data(field="weekly_click", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_click;

    /**
     * Lower estimate of weekly clicks.
     * @DTA\Data(field="weekly_click_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_click_lower;

    /**
     * Upper estimate of weekly clicks.
     * @DTA\Data(field="weekly_click_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_click_upper;

    /**
     * Estimated weekly frequency.
     * @DTA\Data(field="weekly_frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_frequency;

    /**
     * Lower estimate of weekly frequency.
     * @DTA\Data(field="weekly_frequency_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_frequency_lower;

    /**
     * Upper estimate of weekly frequency.
     * @DTA\Data(field="weekly_frequency_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_frequency_upper;

    /**
     * Estimated weekly impressions.
     * @DTA\Data(field="weekly_impression", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_impression;

    /**
     * Lower estimate of weekly impressions.
     * @DTA\Data(field="weekly_impression_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_impression_lower;

    /**
     * Upper estimate of weekly impressions.
     * @DTA\Data(field="weekly_impression_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_impression_upper;

    /**
     * Estimated weekly reach.
     * @DTA\Data(field="weekly_reach", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_reach;

    /**
     * Lower estimate of weekly reach.
     * @DTA\Data(field="weekly_reach_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_reach_lower;

    /**
     * Upper estimate of weekly reach.
     * @DTA\Data(field="weekly_reach_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weekly_reach_upper;

}
