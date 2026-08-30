<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BusinessAssets
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
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $permissions;

    /**
     * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
     * @DTA\Data(field="catalog_info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogBinding::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogBinding::class})
     * @var \App\DTO\CatalogBinding|null
     */
    public $catalog_info;

}
