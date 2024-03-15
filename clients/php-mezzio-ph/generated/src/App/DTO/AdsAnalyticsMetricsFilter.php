<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdsAnalyticsMetricsFilter
{
    /**
     * @DTA\Data(field="field")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdsAnalyticsFilterColumn::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdsAnalyticsFilterColumn::class})
     * @var \App\DTO\AdsAnalyticsFilterColumn|null
     */
    public $field;

    /**
     * @DTA\Data(field="operator")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdsAnalyticsFilterOperator::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdsAnalyticsFilterOperator::class})
     * @var \App\DTO\AdsAnalyticsFilterOperator|null
     */
    public $operator;

    /**
     * List of values for filtering
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var float[]|null
     */
    public $values;

}
