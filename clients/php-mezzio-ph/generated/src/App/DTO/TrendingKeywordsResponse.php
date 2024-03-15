<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TrendingKeywordsResponse
{
    /**
     * The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend.
     * @DTA\Data(field="trends", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection164::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection164::class})
     * @var \App\DTO\Collection164|null
     */
    public $trends;

}
