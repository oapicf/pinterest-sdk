<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductGroupPromotionResponse
{
    /**
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     */
    public ?\App\DTO\Collection126 $items = null;

}
