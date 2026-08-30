<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdateMemberAssetAccessItem
{
    /**
     * Id of the asset to update.
     * @DTA\Data(field="asset_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":25})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $asset_id = null;

    /**
     * Unique identifier of the member on which to perform the update
     * @DTA\Data(field="member_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":25})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $member_id = null;

    /**
     * A non-empty array of permissions to assign to the member.
     * @DTA\Data(field="permissions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection386::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection386::class})
     */
    public ?\App\DTO\Collection386 $permissions = null;

}
