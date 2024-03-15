<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The absolute date range of the template
 */
class TemplateResponseDateRangeAbsoluteDateRange
{
    /**
     * The date range type
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The start date of the date range
     * @DTA\Data(field="start_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $start_date = null;

    /**
     * The end date of the date range
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $end_date = null;

}
