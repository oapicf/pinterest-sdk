<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\Permissions::class})
 * @DTA\Validator(name="Count", options={"min":1,"max":50}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\Permissions::class}}
 * }})
 */
class Collection386 extends \ArrayObject
{
}
