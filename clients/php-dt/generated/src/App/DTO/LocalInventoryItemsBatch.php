<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Unified model for local inventory items batch operation
 */
class LocalInventoryItemsBatch
{
    /**
     * Id of the batch operation
     * @DTA\Data(field="batch_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $batch_id = null;

    /**
     * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @DTA\Data(field="completed_time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $completed_time = null;

    /**
     * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @DTA\Data(field="created_time")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_time = null;

    /**
     * Array of operation results
     * @DTA\Data(field="operation_results")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection419::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection419::class})
     */
    public ?\App\DTO\Collection419 $operation_results = null;

    /**
     * Status of the batch: PROCESSING, COMPLETED, FAILED
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SupplementalItemBatchOperationStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SupplementalItemBatchOperationStatus::class})
     */
    public ?\App\DTO\SupplementalItemBatchOperationStatus $status = null;

}
