<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
class InviteAssetsSummary
{
    /**
     * List of ad account IDs and respective permission levels that will be assigned.
     * @DTA\Data(field="ad_accounts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection368::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection368::class})
     * @var \App\DTO\Collection368|null
     */
    public $ad_accounts;

    /**
     * List of profile IDs and respective permission levels that will be assigned.
     * @DTA\Data(field="profiles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection369::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection369::class})
     * @var \App\DTO\Collection369|null
     */
    public $profiles;

}
