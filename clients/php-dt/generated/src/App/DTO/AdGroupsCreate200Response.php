<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupsCreate200Response
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection30::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection30::class})
     */
    public ?\App\DTO\Collection30 $items = null;

}
