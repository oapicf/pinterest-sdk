<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateAssetAccessRequestResponse
{
    /**
     * A list of errors associated with the asset access requests. Will be returned if there is an error.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection402::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection402::class})
     */
    public ?\App\DTO\Collection402 $exceptions = null;

    /**
     * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
     * @DTA\Data(field="invites", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection403::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection403::class})
     */
    public ?\App\DTO\Collection403 $invites = null;

}
