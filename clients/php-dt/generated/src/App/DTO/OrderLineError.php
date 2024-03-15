<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrderLineError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLine::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLine::class})
     */
    public ?\App\DTO\OrderLine $data = null;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $error_messages = null;

}
