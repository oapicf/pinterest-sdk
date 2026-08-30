<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\IntegrationLogsInvalidLogResponseRejectedLogsItems::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\IntegrationLogsInvalidLogResponseRejectedLogsItems::class}}
 * }})
 */
class Collection435 extends \ArrayObject
{
}
