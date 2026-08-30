<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MetricsResponseDataItems
{
    /**
     * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
     * @DTA\Data(field="metrics")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metrics = null;

    /**
     * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
     * @DTA\Data(field="targeting_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $targeting_type = null;

    /**
     * The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)
     * @DTA\Data(field="targeting_value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $targeting_value = null;

}
