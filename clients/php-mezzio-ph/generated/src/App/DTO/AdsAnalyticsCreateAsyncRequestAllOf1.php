<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdsAnalyticsCreateAsyncRequestAllOf1
{
    /**
     * Metric and entity columns
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ReportingColumnAsync[]|null
     */
    public $columns;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Strategy(name="Object", options={"type":MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":MetricsReportingLevel::class})
     * @var MetricsReportingLevel|null
     */
    public $level;

    /**
     * Specification for formatting report data
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":DataOutputFormat::class})
     * @var DataOutputFormat|null
     */
    public $report_format;

}
