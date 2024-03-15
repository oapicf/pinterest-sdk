<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for delivery_metrics/get
 */
class DeliveryMetricsGetParameterData
{
    /**
     * Report type.
     * @DTA\Data(subset="query", field="report_type", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $report_type = null;

}
