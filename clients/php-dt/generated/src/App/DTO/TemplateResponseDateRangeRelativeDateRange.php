<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The relative date range of the template
 */
class TemplateResponseDateRangeRelativeDateRange
{
    /**
     * The date range type
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The start date of the date range
     * @DTA\Data(field="start_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $start_days_in_past = null;

    /**
     * The end date of the date range
     * @DTA\Data(field="end_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $end_days_in_past = null;

}
