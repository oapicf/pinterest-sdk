<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrderLineResponse
{
    /**
     * Error list if update(s) fail.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrderLineError[]|null
     */
    public $errors;

    /**
     * Order Line object array.
     * @DTA\Data(field="order_line", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrderLine[]|null
     */
    public $order_line;

}
