<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ScalarList", options={"type":\App\DTO\Collection32::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"Scalar", "options":{"type":\App\DTO\Collection32::class}}
 * }})
 */
class Collection33 extends \ArrayObject
{
}
