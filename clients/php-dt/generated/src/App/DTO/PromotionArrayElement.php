<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PromotionArrayElement
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Promotion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Promotion::class})
     */
    public ?\App\DTO\Promotion $data = null;

    /**
     * @DTA\Data(field="exception", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Exception::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Exception::class})
     */
    public ?\App\DTO\Exception $exception = null;

}
