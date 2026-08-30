<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\LeadFormPolicyLink::class})
 * @DTA\Validator(name="Count", options={"min":0,"max":3}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\LeadFormPolicyLink::class}}
 * }})
 */
class Collection231 extends \ArrayObject
{
}
