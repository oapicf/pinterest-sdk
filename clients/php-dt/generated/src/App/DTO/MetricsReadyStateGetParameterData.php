<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for metrics_ready_state/get
 */
class MetricsReadyStateGetParameterData
{
    /**
     * Analytics reports request date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(subset="query", field="date")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})$/"})
     */
    public ?string $date = null;

}
