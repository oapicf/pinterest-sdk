<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetGroupDeletionDelete
{
    /**
     * @DTA\Data(field="asset_groups_to_delete")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection338::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection338::class})
     * @var \App\DTO\Collection338|null
     */
    public $asset_groups_to_delete;

}
