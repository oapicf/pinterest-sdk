<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdsAnalyticsMetricsFilter
{
    /**
     * @DTA\Data(field="field")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdsAnalyticsFilterColumn::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdsAnalyticsFilterColumn::class})
     */
    public ?\App\DTO\AdsAnalyticsFilterColumn $field = null;

    /**
     * @DTA\Data(field="operator")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdsAnalyticsFilterOperator::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdsAnalyticsFilterOperator::class})
     */
    public ?\App\DTO\AdsAnalyticsFilterOperator $operator = null;

    /**
     * List of values for filtering
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $values = null;

}
