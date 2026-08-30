<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\ConversionReportAttributionType::class})
 * @DTA\Validator(name="Count", options={"max":2}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\ConversionReportAttributionType::class}}
 * }})
 */
class Collection306 extends \ArrayObject
{
}
