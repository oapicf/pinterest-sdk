<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductGroupPromotionResponseItem
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductGroupPromotion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductGroupPromotion::class})
     */
    public ?\App\DTO\ProductGroupPromotion $data = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     */
    public ?\App\DTO\Collection125 $exceptions = null;

}
