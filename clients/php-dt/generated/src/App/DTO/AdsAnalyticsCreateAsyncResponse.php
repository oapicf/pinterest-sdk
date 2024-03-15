<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdsAnalyticsCreateAsyncResponse
{
    /**
     * @DTA\Data(field="report_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkReportingJobStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkReportingJobStatus::class})
     */
    public ?\App\DTO\BulkReportingJobStatus $report_status = null;

    /**
     * @DTA\Data(field="token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $token = null;

    /**
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
