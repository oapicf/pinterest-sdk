<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetGroupModificationReadOrUpdate
{
    /**
     * A list of asset groups and the data that will be used to update them.
     * @DTA\Data(field="asset_groups_to_update", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection344::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection344::class})
     * @var \App\DTO\Collection344|null
     */
    public $asset_groups_to_update;

    /**
     * A list of errors associated with the asset groups. Will be returned if there is an error.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection345::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection345::class})
     * @var \App\DTO\Collection345|null
     */
    public $exceptions;

    /**
     * A list of successfully edited asset groups.
     * @DTA\Data(field="updated_asset_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection346::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection346::class})
     * @var \App\DTO\Collection346|null
     */
    public $updated_asset_groups;

}
