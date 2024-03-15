<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrderLineError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLine::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLine::class})
     * @var \App\DTO\OrderLine|null
     */
    public $data;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $error_messages;

}
