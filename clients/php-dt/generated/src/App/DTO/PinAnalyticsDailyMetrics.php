<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PinAnalyticsDailyMetrics
{
    /**
     * @DTA\Data(field="data_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataStatus::class})
     */
    public ?\App\DTO\DataStatus $data_status = null;

    /**
     * Metrics date (UTC): YYYY-MM-DD.
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $date = null;

    /**
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection442::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection442::class})
     */
    public ?\App\DTO\Collection442 $metrics = null;

}
