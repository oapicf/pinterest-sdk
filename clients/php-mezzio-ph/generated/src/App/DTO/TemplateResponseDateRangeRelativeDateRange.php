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
     * @var string|null
     */
    public $type;

    /**
     * The start date of the date range
     * @DTA\Data(field="start_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $start_days_in_past;

    /**
     * The end date of the date range
     * @DTA\Data(field="end_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $end_days_in_past;

}
