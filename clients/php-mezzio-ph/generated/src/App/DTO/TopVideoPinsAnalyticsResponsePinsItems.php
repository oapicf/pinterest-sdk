<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Array with metrics, status, and pin id for the requested metric
 */
class TopVideoPinsAnalyticsResponsePinsItems
{
    /**
     * @DTA\Data(field="data_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection500::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection500::class})
     * @var \App\DTO\Collection500|null
     */
    public $data_status;

    /**
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection501::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection501::class})
     * @var \App\DTO\Collection501|null
     */
    public $metrics;

    /**
     * The pin id
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_id;

}
