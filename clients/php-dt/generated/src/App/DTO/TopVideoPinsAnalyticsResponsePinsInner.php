<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Array with metrics, status, and pin id for the requested metric
 */
class TopVideoPinsAnalyticsResponsePinsInner
{
    /**
     * The metric name and daily value for each requested metric
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection174::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection174::class})
     */
    public ?\App\DTO\Collection174 $metrics = null;

    /**
     * @DTA\Data(field="data_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection175::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection175::class})
     */
    public ?\App\DTO\Collection175 $data_status = null;

    /**
     * The pin id
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pin_id = null;

}
