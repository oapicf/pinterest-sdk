<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object with a list of member asset accesses to delete.
 */
class BusinessMembersAssetAccessDeleteBody
{
    /**
     * List of members asset access to be deleted
     * @DTA\Data(field="accesses")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection384::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection384::class})
     * @var \App\DTO\Collection384|null
     */
    public $accesses;

}
