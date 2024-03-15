<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for delivery_metrics/get
 */
class DeliveryMetricsGetQueryData
{
    /**
     * Report type.
     * @DTA\Data(field="report_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $report_type;

}
