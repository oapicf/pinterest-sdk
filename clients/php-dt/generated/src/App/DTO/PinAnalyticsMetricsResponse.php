<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PinAnalyticsMetricsResponse
{
    /**
     * The lifetime metric name and value.
     * @DTA\Data(field="lifetime_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection147::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection147::class})
     */
    public ?\App\DTO\Collection147 $lifetime_metrics = null;

    /**
     * Array with the requested daily metric records
     * @DTA\Data(field="daily_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection149::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection149::class})
     */
    public ?\App\DTO\Collection149 $daily_metrics = null;

    /**
     * The metric name and value over the requested period for each requested metric
     * @DTA\Data(field="summary_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection150::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection150::class})
     */
    public ?\App\DTO\Collection150 $summary_metrics = null;

}
