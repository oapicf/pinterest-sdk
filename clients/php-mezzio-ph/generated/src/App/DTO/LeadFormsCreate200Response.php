<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LeadFormsCreate200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection235::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection235::class})
     * @var \App\DTO\Collection235|null
     */
    public $items;

}
