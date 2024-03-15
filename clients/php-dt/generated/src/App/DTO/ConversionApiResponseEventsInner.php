<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ConversionApiResponseEventsInner
{
    /**
     * Whether the event was processed successfully.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * Error message containing more information about why the event failed to be processed.
     * @DTA\Data(field="error_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error_message = null;

    /**
     * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
     * @DTA\Data(field="warning_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $warning_message = null;

}
