<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectMap", options={"type":\App\DTO\AnalyticsMetricsResponse::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\AnalyticsMetricsResponse::class}}
 * }})
 */
class Collection9 extends \ArrayObject
{
}
