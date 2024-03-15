<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AnalyticsMetricsResponse
{
    /**
     * The metric name and value over the requested period for each requested metric
     * @DTA\Data(field="summary_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection166::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection166::class})
     */
    public ?\App\DTO\Collection166 $summary_metrics = null;

    /**
     * Array with the requested daily metric records
     * @DTA\Data(field="daily_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection168::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection168::class})
     */
    public ?\App\DTO\Collection168 $daily_metrics = null;

}
