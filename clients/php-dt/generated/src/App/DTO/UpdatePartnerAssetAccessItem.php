<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdatePartnerAssetAccessItem
{
    /**
     * Unique identifier of the business asset.
     * @DTA\Data(field="asset_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":25})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $asset_id = null;

    /**
     * Unique identifier of a business partner to update asset access to.
     * @DTA\Data(field="partner_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":25})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $partner_id = null;

    /**
     * A non-empty array of permissions to assign to the partner.
     * @DTA\Data(field="permissions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection395::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection395::class})
     */
    public ?\App\DTO\Collection395 $permissions = null;

}
