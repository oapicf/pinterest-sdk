<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */
class ConversionApiResponse
{
    /**
     * Total number of events received in the request.
     * @DTA\Data(field="num_events_received")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $num_events_received;

    /**
     * Number of events that were successfully processed from the events.
     * @DTA\Data(field="num_events_processed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $num_events_processed;

    /**
     * Specific messages for each event received. The order will match the order in which the events were received in the request.
     * @DTA\Data(field="events")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection111::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection111::class})
     * @var \App\DTO\Collection111|null
     */
    public $events;

}
