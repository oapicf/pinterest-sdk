<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response model for supplemental items batch operation
 */
class SupplementalItemsBatchResponse
{
    /**
     * Id of the batch operation
     * @DTA\Data(field="batch_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $batch_id;

    /**
     * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @DTA\Data(field="completed_time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $completed_time;

    /**
     * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @DTA\Data(field="created_time")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_time;

    /**
     * Array of operation results
     * @DTA\Data(field="operation_results")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection418::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection418::class})
     * @var \App\DTO\Collection418|null
     */
    public $operation_results;

    /**
     * Status of the batch: PROCESSING, COMPLETED, FAILED
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SupplementalItemBatchOperationStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SupplementalItemBatchOperationStatus::class})
     * @var \App\DTO\SupplementalItemBatchOperationStatus|null
     */
    public $status;

}
