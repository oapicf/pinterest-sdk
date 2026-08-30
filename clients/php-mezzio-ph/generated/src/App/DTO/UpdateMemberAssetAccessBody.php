<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object with a list of all the new member asset accesses.
 */
class UpdateMemberAssetAccessBody
{
    /**
     * List of member asset accesses to assign or update.
     * @DTA\Data(field="accesses")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection387::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection387::class})
     * @var \App\DTO\Collection387|null
     */
    public $accesses;

}
