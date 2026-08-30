<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Wrapper model for ProductGroupPromotion.
 */
class ProductGroupPromotions
{
    /**
     * Response-only: created or updated product group promotions, or exceptions.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection257::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection257::class})
     * @var \App\DTO\Collection257|null
     */
    public $items;

}
