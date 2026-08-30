<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InviteAssetsSummaryItem
{
    /**
     * Unique identifier of the asset.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Permission levels member or partner has on an asset.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection351::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection351::class})
     * @var \App\DTO\Collection351|null
     */
    public $permissions;

}
