<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PinAnalyticsMetricsResponse
{
    /**
     * Array with the requested daily metric records
     * @DTA\Data(field="daily_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection443::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection443::class})
     * @var \App\DTO\Collection443|null
     */
    public $daily_metrics;

    /**
     * The lifetime metric name and value.
     * @DTA\Data(field="lifetime_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection444::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection444::class})
     * @var \App\DTO\Collection444|null
     */
    public $lifetime_metrics;

    /**
     * The metric name and value over the requested period for each requested metric
     * @DTA\Data(field="summary_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection445::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection445::class})
     * @var \App\DTO\Collection445|null
     */
    public $summary_metrics;

}
