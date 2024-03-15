<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdArrayResponseElement
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdResponse::class})
     */
    public ?\App\DTO\AdResponse $data = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Exception::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Exception::class})
     */
    public ?\App\DTO\Exception $exceptions = null;

}
