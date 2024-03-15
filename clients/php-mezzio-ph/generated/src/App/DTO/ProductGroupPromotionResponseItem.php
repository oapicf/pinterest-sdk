<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProductGroupPromotionResponseItem
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductGroupPromotion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductGroupPromotion::class})
     * @var \App\DTO\ProductGroupPromotion|null
     */
    public $data;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     * @var \App\DTO\Collection125|null
     */
    public $exceptions;

}
