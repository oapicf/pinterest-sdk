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
     * @var string|null
     */
    public $type;

    /**
     * The start date of the date range
     * @DTA\Data(field="start_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $start_date;

    /**
     * The end date of the date range
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $end_date;

}
