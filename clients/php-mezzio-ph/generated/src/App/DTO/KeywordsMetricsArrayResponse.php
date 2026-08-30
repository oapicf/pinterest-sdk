<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeywordsMetricsArrayResponse
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection212::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection212::class})
     * @var \App\DTO\Collection212|null
     */
    public $data;

}
