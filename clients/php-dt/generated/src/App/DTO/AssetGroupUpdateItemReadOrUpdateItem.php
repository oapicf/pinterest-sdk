<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssetGroupUpdateItemReadOrUpdateItem
{
    /**
     * Unique identifier of the asset group to update.
     * @DTA\Data(field="asset_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $asset_group_id = null;

    /**
     * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
     * @DTA\Data(field="asset_group_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection341::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection341::class})
     */
    public ?\App\DTO\Collection341 $asset_group_types = null;

    /**
     * A list of asset ids to add to the asset group.
     * @DTA\Data(field="assets_to_add", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection342::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection342::class})
     */
    public ?\App\DTO\Collection342 $assets_to_add = null;

    /**
     * A list of asset ids to remove from the asset group.
     * @DTA\Data(field="assets_to_remove", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection343::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection343::class})
     */
    public ?\App\DTO\Collection343 $assets_to_remove = null;

    /**
     * Asset group description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Asset Group name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
