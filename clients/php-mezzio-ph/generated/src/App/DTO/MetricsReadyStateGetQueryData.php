<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for metrics_ready_state/get
 */
class MetricsReadyStateGetQueryData
{
    /**
     * Analytics reports request date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="date")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $date;

}
