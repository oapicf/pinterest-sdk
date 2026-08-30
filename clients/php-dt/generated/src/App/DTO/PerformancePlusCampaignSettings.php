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
     */
    public ?bool $boost_prospecting_ad_group_bid = null;

    /**
     * List of campaign-level exclusion pinner list IDs.
     * @DTA\Data(field="pinner_list_exclusions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $pinner_list_exclusions = null;

}
