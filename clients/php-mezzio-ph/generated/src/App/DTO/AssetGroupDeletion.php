<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetGroupDeletion
{
    /**
     * @DTA\Data(field="deleted_asset_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection339::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection339::class})
     * @var \App\DTO\Collection339|null
     */
    public $deleted_asset_groups;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection340::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection340::class})
     * @var \App\DTO\Collection340|null
     */
    public $exceptions;

}
