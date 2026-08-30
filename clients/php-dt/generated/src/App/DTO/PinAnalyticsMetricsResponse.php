<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PinAnalyticsMetricsResponse
{
    /**
     * Array with the requested daily metric records
     * @DTA\Data(field="daily_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection443::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection443::class})
     */
    public ?\App\DTO\Collection443 $daily_metrics = null;

    /**
     * The lifetime metric name and value.
     * @DTA\Data(field="lifetime_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection444::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection444::class})
     */
    public ?\App\DTO\Collection444 $lifetime_metrics = null;

    /**
     * The metric name and value over the requested period for each requested metric
     * @DTA\Data(field="summary_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection445::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection445::class})
     */
    public ?\App\DTO\Collection445 $summary_metrics = null;

}
