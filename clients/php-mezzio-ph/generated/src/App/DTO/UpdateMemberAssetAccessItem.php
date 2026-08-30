<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdateMemberAssetAccessItem
{
    /**
     * Id of the asset to update.
     * @DTA\Data(field="asset_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":25})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $asset_id;

    /**
     * Unique identifier of the member on which to perform the update
     * @DTA\Data(field="member_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":25})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $member_id;

    /**
     * A non-empty array of permissions to assign to the member.
     * @DTA\Data(field="permissions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection386::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection386::class})
     * @var \App\DTO\Collection386|null
     */
    public $permissions;

}
