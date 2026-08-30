<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateAssetAccessRequestItem
{
    /**
     * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     * @DTA\Data(field="asset_id_to_permissions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection329::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection329::class})
     */
    public ?\App\DTO\Collection329 $asset_id_to_permissions = null;

    /**
     * Unique identifier of a business partner to request asset access to.
     * @DTA\Data(field="partner_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $partner_id = null;

}
