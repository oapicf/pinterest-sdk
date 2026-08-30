<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\PinPromotionSummaryStatus::class})
 * @DTA\Validator(name="Count", options={"min":1,"max":6}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\PinPromotionSummaryStatus::class}}
 * }})
 */
class Collection273 extends \ArrayObject
{
}
