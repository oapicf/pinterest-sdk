<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Keyword metrics JSON
 */
class KeywordMetrics
{
    /**
     * Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response
     * @DTA\Data(field="keyword_query_volume", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $keyword_query_volume = null;

}
