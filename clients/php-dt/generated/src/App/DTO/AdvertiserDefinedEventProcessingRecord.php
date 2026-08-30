<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Processing record for an advertiser defined event operation
 */
class AdvertiserDefinedEventProcessingRecord
{
    /**
     * List of exception messages if the operation failed
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection87::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection87::class})
     */
    public ?\App\DTO\Collection87 $exceptions = null;

    /**
     * Name of the advertiser defined event
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Processing status (success or failure)
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

}
