<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssetGroupInputCreate
{
    /**
     * @DTA\Data(field="asset_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssetGroupBinding::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssetGroupBinding::class})
     */
    public ?\App\DTO\AssetGroupBinding $asset_group = null;

    /**
     * Asset group description.
     * @DTA\Data(field="asset_group_description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $asset_group_description = null;

    /**
     * Asset Group name.
     * @DTA\Data(field="asset_group_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $asset_group_name = null;

    /**
     * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
     * @DTA\Data(field="asset_group_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection337::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection337::class})
     */
    public ?\App\DTO\Collection337 $asset_group_types = null;

}
