<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object containing the permissions a business member has on the asset.
 */
class UsersForIndividualAssetResponse
{
    /**
     * Unique identifier of a business asset.
     * @DTA\Data(field="asset_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $asset_id;

    /**
     * Unique identifier of the business member with asset access.
     * @DTA\Data(field="member_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $member_id;

    /**
     * Permission levels member or partner has on an asset.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection351::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection351::class})
     * @var \App\DTO\Collection351|null
     */
    public $permissions;

}
