<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Advertiser defined event input for create/update operations
 */
class AdvertiserDefinedEventInput
{
    /**
     * Pinterest standard event type to map this custom event to for campaign optimization and reporting
     * @DTA\Data(field="mapped_conversion_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdvertiserDefinedEventMappingType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdvertiserDefinedEventMappingType::class})
     */
    public ?\App\DTO\AdvertiserDefinedEventMappingType $mapped_conversion_type = null;

    /**
     * Raw string name of the event
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
