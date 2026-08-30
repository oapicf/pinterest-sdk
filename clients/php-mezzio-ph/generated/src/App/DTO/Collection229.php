<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\LeadFormQuestion::class})
 * @DTA\Validator(name="Count", options={"min":0,"max":10}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\LeadFormQuestion::class}}
 * }})
 */
class Collection229 extends \ArrayObject
{
}
