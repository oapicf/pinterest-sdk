<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdvertiserDefinedEventsGet200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection85::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection85::class})
     */
    public ?\App\DTO\Collection85 $items = null;

}
