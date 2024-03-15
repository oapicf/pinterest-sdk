<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrderLineSingleResponse
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLineResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLineResponse::class})
     * @var \App\DTO\OrderLineResponse|null
     */
    public $data;

}
