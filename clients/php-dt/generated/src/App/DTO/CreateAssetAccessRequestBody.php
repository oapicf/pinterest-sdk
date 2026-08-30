<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object containing a list of all the asset access requests
 */
class CreateAssetAccessRequestBody
{
    /**
     * @DTA\Data(field="asset_requests")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection400::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection400::class})
     */
    public ?\App\DTO\Collection400 $asset_requests = null;

}
