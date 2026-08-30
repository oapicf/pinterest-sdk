<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DeliveryMetricsGet200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection454::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection454::class})
     * @var \App\DTO\Collection454|null
     */
    public $items;

}
