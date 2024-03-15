<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DeliveryMetricsResponse
{
    /**
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection153::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection153::class})
     * @var \App\DTO\Collection153|null
     */
    public $items;

}
