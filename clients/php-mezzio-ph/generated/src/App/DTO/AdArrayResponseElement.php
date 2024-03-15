<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdArrayResponseElement
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdResponse::class})
     * @var \App\DTO\AdResponse|null
     */
    public $data;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Exception::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Exception::class})
     * @var \App\DTO\Exception|null
     */
    public $exceptions;

}
