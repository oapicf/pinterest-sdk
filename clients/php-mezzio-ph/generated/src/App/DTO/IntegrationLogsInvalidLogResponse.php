<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Schema describing the response when a log has invalid fields.
 */
class IntegrationLogsInvalidLogResponse
{
    /**
     * @DTA\Data(field="rejected_logs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\IntegrationLogsInvalidLogResponseRejectedLogsInner[]|null
     */
    public $rejected_logs;

}
