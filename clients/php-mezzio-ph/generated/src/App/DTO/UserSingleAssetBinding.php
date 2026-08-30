<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object containing the permissions a business member/partner has on the asset.
 */
class UserSingleAssetBinding
{
    /**
     * Permission levels member or partner has on an asset.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection351::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection351::class})
     * @var \App\DTO\Collection351|null
     */
    public $permissions;

    /**
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $user;

}
