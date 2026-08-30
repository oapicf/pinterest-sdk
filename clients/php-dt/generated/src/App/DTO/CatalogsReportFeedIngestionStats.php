<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsReportFeedIngestionStats
{
    /**
     * ID of the catalog entity.
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

    /**
     * The event code that a diagnostics aggregated number references
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $code = null;

    /**
     * A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)
     * @DTA\Data(field="code_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code_label = null;

    /**
     * Title message describing the diagnostic issue
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

    /**
     * Number of occurrences of the issue
     * @DTA\Data(field="occurrences", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $occurrences = null;

    /**
     * @DTA\Data(field="report_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $report_type = null;

    /**
     * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
     * @DTA\Data(field="severity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $severity = null;

}
