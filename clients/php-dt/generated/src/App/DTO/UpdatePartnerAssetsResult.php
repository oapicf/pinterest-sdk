<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object containing the permissions a business partner has on the asset.
 */
class UpdatePartnerAssetsResult
{
    /**
     * Unique identifier of a business asset.
     * @DTA\Data(field="asset_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $asset_id = null;

    /**
     * @DTA\Data(field="asset_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssetTypeResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssetTypeResponse::class})
     */
    public ?\App\DTO\AssetTypeResponse $asset_type = null;

    /**
     * Unique identifier of a business partner.
     * @DTA\Data(field="partner_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $partner_id = null;

    /**
     * Permission levels member or partner has on an asset.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection351::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection351::class})
     */
    public ?\App\DTO\Collection351 $permissions = null;

}
