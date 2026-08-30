<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetGroupModification
{
    /**
     * A list of errors associated with the asset groups. Will be returned if there is an error.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection347::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection347::class})
     * @var \App\DTO\Collection347|null
     */
    public $exceptions;

    /**
     * A list of successfully edited asset groups.
     * @DTA\Data(field="updated_asset_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection348::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection348::class})
     * @var \App\DTO\Collection348|null
     */
    public $updated_asset_groups;

}
