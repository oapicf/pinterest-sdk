<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetGroupInput
{
    /**
     * @DTA\Data(field="asset_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssetGroupBinding::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssetGroupBinding::class})
     * @var \App\DTO\AssetGroupBinding|null
     */
    public $asset_group;

}
