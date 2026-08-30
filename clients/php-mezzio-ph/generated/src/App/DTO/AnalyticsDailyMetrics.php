<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AnalyticsDailyMetrics
{
    /**
     * @DTA\Data(field="data_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataStatus::class})
     * @var \App\DTO\DataStatus|null
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
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection491::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection491::class})
     * @var \App\DTO\Collection491|null
     */
    public $metrics;

}
