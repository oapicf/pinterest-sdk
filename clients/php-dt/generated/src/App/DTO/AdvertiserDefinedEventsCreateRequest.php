<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request body for creating or updating advertiser defined events
 */
class AdvertiserDefinedEventsCreateRequest
{
    /**
     * List of advertiser defined events to create or update
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection86::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection86::class})
     */
    public ?\App\DTO\Collection86 $items = null;

}
