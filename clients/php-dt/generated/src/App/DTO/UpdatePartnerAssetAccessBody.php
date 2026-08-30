<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object with a list of partner asset accesses to assign or update.
 */
class UpdatePartnerAssetAccessBody
{
    /**
     * List of partner asset accesses to assign or update.
     * @DTA\Data(field="accesses")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection396::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection396::class})
     */
    public ?\App\DTO\Collection396 $accesses = null;

}
