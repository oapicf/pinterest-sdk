<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MetricsResponse
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection15::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection15::class})
     * @var \App\DTO\Collection15|null
     */
    public $data;

}
