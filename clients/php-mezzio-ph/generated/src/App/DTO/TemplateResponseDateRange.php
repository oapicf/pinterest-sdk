<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TemplateResponseDateRange
{
    /**
     * @DTA\Data(field="dynamic_date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRangeDynamicDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRangeDynamicDateRange::class})
     * @var \App\DTO\TemplateResponseDateRangeDynamicDateRange|null
     */
    public $dynamic_date_range;

    /**
     * @DTA\Data(field="relative_date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRangeRelativeDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRangeRelativeDateRange::class})
     * @var \App\DTO\TemplateResponseDateRangeRelativeDateRange|null
     */
    public $relative_date_range;

    /**
     * @DTA\Data(field="absolute_date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRangeAbsoluteDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRangeAbsoluteDateRange::class})
     * @var \App\DTO\TemplateResponseDateRangeAbsoluteDateRange|null
     */
    public $absolute_date_range;

}
