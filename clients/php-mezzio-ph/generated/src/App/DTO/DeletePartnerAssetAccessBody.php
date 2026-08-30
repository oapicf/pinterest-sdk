<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object with a list of partner asset accesses to delete.
 */
class DeletePartnerAssetAccessBody
{
    /**
     * List of partner asset accesses to delete.
     * @DTA\Data(field="accesses")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection393::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection393::class})
     * @var \App\DTO\Collection393|null
     */
    public $accesses;

}
