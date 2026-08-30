<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ConversionProductReport
{
    /**
     * Message returned from the create report request
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

    /**
     * Async report status
     * @DTA\Data(field="report_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkReportingJobStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkReportingJobStatus::class})
     */
    public ?\App\DTO\BulkReportingJobStatus $report_status = null;

    /**
     * Size of the report in bytes
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $size = null;

    /**
     * Token returned from the create report request
     * @DTA\Data(field="token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $token = null;

    /**
     * URL of the report
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

}
