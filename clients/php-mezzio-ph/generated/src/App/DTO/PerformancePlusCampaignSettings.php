<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pinterest Performance+ campaign settings.
 */
class PerformancePlusCampaignSettings
{
    /**
     * Whether to boost prospecting ad group bid.
     * @DTA\Data(field="boost_prospecting_ad_group_bid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $boost_prospecting_ad_group_bid;

    /**
     * List of campaign-level exclusion pinner list IDs.
     * @DTA\Data(field="pinner_list_exclusions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $pinner_list_exclusions;

}
