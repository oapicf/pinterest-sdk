<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an item processing record
 */
class HotelProcessingRecord
{
    /**
     * The catalog hotel id in the merchant namespace
     * @DTA\Data(field="hotel_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $hotel_id;

    /**
     * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ItemValidationEvent[]|null
     */
    public $errors;

    /**
     * Array with the validation warnings for the item processing record
     * @DTA\Data(field="warnings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ItemValidationEvent[]|null
     */
    public $warnings;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemProcessingStatus::class})
     * @var \App\DTO\ItemProcessingStatus|null
     */
    public $status;

}
