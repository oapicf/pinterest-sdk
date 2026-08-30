<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\MultiPinsAnalyticsMetricTypesItem::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\MultiPinsAnalyticsMetricTypesItem::class}}
 * }})
 */
class Collection441 extends \ArrayObject
{
}
