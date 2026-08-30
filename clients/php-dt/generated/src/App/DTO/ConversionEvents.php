<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Conversion events.
 */
class ConversionEvents
{
    /**
     * Specific messages for each event received. The order will match the order in which the events were received in the request.
     * @DTA\Data(field="events")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection201::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection201::class})
     */
    public ?\App\DTO\Collection201 $events = null;

    /**
     * Number of events that were successfully processed from the events.
     * @DTA\Data(field="num_events_processed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $num_events_processed = null;

    /**
     * Total number of events received in the request.
     * @DTA\Data(field="num_events_received")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $num_events_received = null;

}
