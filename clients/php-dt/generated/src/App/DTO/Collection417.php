<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\LocalInventoryOperation::class})
 * @DTA\Validator(name="Count", options={"min":1,"max":1000}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\LocalInventoryOperation::class}}
 * }})
 */
class Collection417 extends \ArrayObject
{
}
