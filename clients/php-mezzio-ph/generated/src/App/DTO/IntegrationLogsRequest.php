<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Batch of logs sent from an integration application.
 */
class IntegrationLogsRequest
{
    /**
     * @DTA\Data(field="logs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection143::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection143::class})
     * @var \App\DTO\Collection143|null
     */
    public $logs;

}
