<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object containing the permissions a business has on the asset.
 */
class BaseBusinessAssets
{
    /**
     * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
     * @DTA\Data(field="asset_group_info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssetGroupBinding::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssetGroupBinding::class})
     * @var \App\DTO\AssetGroupBinding|null
     */
    public $asset_group_info;

    /**
     * Unique identifier of a business asset.
     * @DTA\Data(field="asset_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":20})
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
     * Permission levels the requesting business has on an asset.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection398::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection398::class})
     * @var \App\DTO\Collection398|null
     */
    public $permissions;

}
