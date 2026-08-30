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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $asset_id;

    /**
     * @DTA\Data(field="asset_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssetTypeResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssetTypeResponse::class})
     * @var \App\DTO\AssetTypeResponse|null
     */
    public $asset_type;

    /**
     * Unique identifier of a business partner.
     * @DTA\Data(field="partner_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $partner_id;

    /**
     * Permission levels member or partner has on an asset.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection351::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection351::class})
     * @var \App\DTO\Collection351|null
     */
    public $permissions;

}
