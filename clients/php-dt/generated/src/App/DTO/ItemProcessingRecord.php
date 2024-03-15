<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an item processing record
 */
class ItemProcessingRecord
{
    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $errors = null;

    /**
     * Array with the validation warnings for the item processing record
     * @DTA\Data(field="warnings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warnings = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemProcessingStatus::class})
     */
    public ?\App\DTO\ItemProcessingStatus $status = null;

}
