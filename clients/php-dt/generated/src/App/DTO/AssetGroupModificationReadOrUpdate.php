<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssetGroupModificationReadOrUpdate
{
    /**
     * A list of asset groups and the data that will be used to update them.
     * @DTA\Data(field="asset_groups_to_update", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection344::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection344::class})
     */
    public ?\App\DTO\Collection344 $asset_groups_to_update = null;

    /**
     * A list of errors associated with the asset groups. Will be returned if there is an error.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection345::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection345::class})
     */
    public ?\App\DTO\Collection345 $exceptions = null;

    /**
     * A list of successfully edited asset groups.
     * @DTA\Data(field="updated_asset_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection346::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection346::class})
     */
    public ?\App\DTO\Collection346 $updated_asset_groups = null;

}
