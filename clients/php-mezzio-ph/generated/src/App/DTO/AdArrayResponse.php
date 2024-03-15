<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdArrayResponse
{
    /**
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection36::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection36::class})
     * @var \App\DTO\Collection36|null
     */
    public $items;

}
