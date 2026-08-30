<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class KeywordMetricsResponse
{
    /**
     * Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;
     * @DTA\Data(field="keyword", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $keyword = null;

    /**
     * @DTA\Data(field="metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\KeywordMetrics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\KeywordMetrics::class})
     */
    public ?\App\DTO\KeywordMetrics $metrics = null;

}
