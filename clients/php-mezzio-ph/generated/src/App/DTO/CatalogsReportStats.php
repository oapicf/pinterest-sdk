<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Diagnostics aggregated numbers
 */
class CatalogsReportStats
{
    /**
     * ID of the catalog entity.
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_id;

    /**
     * The event code that a diagnostics aggregated number references
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $code;

    /**
     * A human-friendly label for the event code (e.g, &#39;SPAM&#39;)
     * @DTA\Data(field="code_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code_label;

    /**
     * Title message describing the diagnostic issue
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

    /**
     * Number of occurrences of the issue
     * @DTA\Data(field="occurrences", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $occurrences;

    /**
     * @DTA\Data(field="report_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $report_type;

    /**
     * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
     * @DTA\Data(field="severity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $severity;

    /**
     * Indicates if issue makes items ineligible for ads distribution
     * @DTA\Data(field="ineligible_for_ads", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $ineligible_for_ads;

    /**
     * Indicates if issue makes items ineligible for organic distribution
     * @DTA\Data(field="ineligible_for_organic", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $ineligible_for_organic;

}
