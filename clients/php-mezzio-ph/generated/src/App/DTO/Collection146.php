<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\CampaignAdPreviewCreate200ResponseInner::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\CampaignAdPreviewCreate200ResponseInner::class}}
 * }})
 */
class Collection146 extends \ArrayObject
{
}
