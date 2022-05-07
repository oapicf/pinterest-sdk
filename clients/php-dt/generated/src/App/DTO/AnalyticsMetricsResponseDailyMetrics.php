<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AnalyticsMetricsResponseDailyMetrics
{
    /**
     * Metrics availablity, e.g., \&quot;READY\&quot;.
     * @DTA\Data(field="data_status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $data_status;

    /**
     * Metrics date (UTC): YYYY-MM-DD.
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $date;

    /**
     * The metric name and daily value for each requested metric
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     * @var \App\DTO\Collection6|null
     */
    public $metrics;

}
