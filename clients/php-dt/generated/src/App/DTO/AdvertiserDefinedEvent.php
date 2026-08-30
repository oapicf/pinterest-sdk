<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Advertiser defined event
 */
class AdvertiserDefinedEvent
{
    /**
     * Standard type mapped to ADE for optimization
     * @DTA\Data(field="mapped_conversion_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagTypeOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagTypeOptimal::class})
     */
    public ?\App\DTO\ConversionTagTypeOptimal $mapped_conversion_type = null;

    /**
     * Raw string name of the event, usually logged as raw_event_name in our dataset
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
