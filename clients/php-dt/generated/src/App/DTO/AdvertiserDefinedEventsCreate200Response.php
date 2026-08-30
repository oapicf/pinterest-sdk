<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdvertiserDefinedEventsCreate200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection88::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection88::class})
     */
    public ?\App\DTO\Collection88 $items = null;

}
