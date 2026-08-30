<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Result model for local inventory operation
 */
class LocalInventoryOperationResult
{
    /**
     * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $errors = null;

    /**
     * Catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * Status of the item processing record
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SupplementalItemProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SupplementalItemProcessingStatus::class})
     */
    public ?\App\DTO\SupplementalItemProcessingStatus $status = null;

    /**
     * Store code for the local inventory item
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $store_code = null;

    /**
     * @DTA\Data(field="supplemental_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $supplemental_type = null;

    /**
     * Array with the validation warnings for the item processing record
     * @DTA\Data(field="warnings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warnings = null;

}
