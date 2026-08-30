<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Array with metrics, status, and pin id for the requested metric
 */
class TopPinsAnalyticsResponsePinsItems
{
    /**
     * @DTA\Data(field="data_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection496::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection496::class})
     * @var \App\DTO\Collection496|null
     */
    public $data_status;

    /**
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection497::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection497::class})
     * @var \App\DTO\Collection497|null
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
