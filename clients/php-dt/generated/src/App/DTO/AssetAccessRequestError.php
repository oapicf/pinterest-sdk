<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssetAccessRequestError
{
    /**
     * Error code associated with the error in requesting asset access.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $code = null;

    /**
     * @DTA\Data(field="messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection401::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection401::class})
     */
    public ?\App\DTO\Collection401 $messages = null;

}
