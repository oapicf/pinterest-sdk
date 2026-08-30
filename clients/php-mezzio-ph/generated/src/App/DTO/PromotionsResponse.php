<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PromotionsResponse
{
    /**
     * @DTA\Data(field="promotions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection267::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection267::class})
     * @var \App\DTO\Collection267|null
     */
    public $promotions;

}
