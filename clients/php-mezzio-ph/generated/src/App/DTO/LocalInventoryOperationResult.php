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
     * @var \App\DTO\SupplementalItemValidationEvent[]|null
     */
    public $errors;

    /**
     * Catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * Status of the item processing record
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SupplementalItemProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SupplementalItemProcessingStatus::class})
     * @var \App\DTO\SupplementalItemProcessingStatus|null
     */
    public $status;

    /**
     * Store code for the local inventory item
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_code;

    /**
     * @DTA\Data(field="supplemental_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $supplemental_type;

    /**
     * Array with the validation warnings for the item processing record
     * @DTA\Data(field="warnings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\SupplementalItemValidationEvent[]|null
     */
    public $warnings;

}
