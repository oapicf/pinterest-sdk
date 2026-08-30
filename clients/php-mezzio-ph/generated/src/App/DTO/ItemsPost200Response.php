<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemsPost200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection407::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection407::class})
     * @var \App\DTO\Collection407|null
     */
    public $items;

}
