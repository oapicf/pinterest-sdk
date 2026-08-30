<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class IntegrationLogsRequestCreate
{
    /**
     * @DTA\Data(field="logs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection434::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection434::class})
     * @var \App\DTO\Collection434|null
     */
    public $logs;

}
