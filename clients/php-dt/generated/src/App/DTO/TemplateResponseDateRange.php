<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TemplateResponseDateRange
{
    /**
     * @DTA\Data(field="dynamic_date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRangeDynamicDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRangeDynamicDateRange::class})
     */
    public ?\App\DTO\TemplateResponseDateRangeDynamicDateRange $dynamic_date_range = null;

    /**
     * @DTA\Data(field="relative_date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRangeRelativeDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRangeRelativeDateRange::class})
     */
    public ?\App\DTO\TemplateResponseDateRangeRelativeDateRange $relative_date_range = null;

    /**
     * @DTA\Data(field="absolute_date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRangeAbsoluteDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRangeAbsoluteDateRange::class})
     */
    public ?\App\DTO\TemplateResponseDateRangeAbsoluteDateRange $absolute_date_range = null;

}
