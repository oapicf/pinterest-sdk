<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad accounts and profiles the business member/partner has access to.
 */
class BusinessMemberAssetsSummary
{
    /**
     * List of ad account IDs and respective permission levels.
     * @DTA\Data(field="ad_accounts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $ad_accounts = null;

    /**
     * List of profile IDs and respective permission levels.
     * @DTA\Data(field="profiles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $profiles = null;

}
