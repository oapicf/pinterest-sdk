<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Bulk request result data.
 */
class BulkJobData
{
    /**
     * Presigned s3 file url for the bulk request result.
     * @DTA\Data(field="result_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $result_url = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkRequestStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkRequestStatus::class})
     */
    public ?\App\DTO\BulkRequestStatus $status = null;

    /**
     * Bulk Workload Id.
     * @DTA\Data(field="workload_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $workload_id = null;

}
