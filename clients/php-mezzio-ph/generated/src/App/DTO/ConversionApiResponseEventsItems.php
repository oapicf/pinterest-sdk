<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionApiResponseEventsItems
{
    /**
     * Error message containing more information about why the event failed to be processed.
     * @DTA\Data(field="error_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $error_message;

    /**
     * Whether the event was processed successfully.
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EventProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EventProcessingStatus::class})
     * @var \App\DTO\EventProcessingStatus|null
     */
    public $status;

    /**
     * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
     * @DTA\Data(field="warning_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $warning_message;

}
