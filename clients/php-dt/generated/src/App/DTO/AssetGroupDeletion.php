<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssetGroupDeletion
{
    /**
     * @DTA\Data(field="deleted_asset_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection339::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection339::class})
     */
    public ?\App\DTO\Collection339 $deleted_asset_groups = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection340::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection340::class})
     */
    public ?\App\DTO\Collection340 $exceptions = null;

}
