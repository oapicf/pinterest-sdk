<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Conversion events.
 */
class ConversionEventsCreate
{
    /**
     * A list of events (one or more) encapsulated by a data object.
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection200::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection200::class})
     * @var \App\DTO\Collection200|null
     */
    public $data;

}
