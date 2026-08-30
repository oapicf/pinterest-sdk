<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionTagsList200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection185::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection185::class})
     * @var \App\DTO\Collection185|null
     */
    public $items;

}
