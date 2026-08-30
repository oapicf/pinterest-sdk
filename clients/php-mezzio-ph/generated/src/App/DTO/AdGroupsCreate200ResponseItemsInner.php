<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdGroupsCreate200ResponseItemsInner
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroup::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroup::class})
     * @var \App\DTO\AdGroup|null
     */
    public $data;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection29::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection29::class})
     * @var \App\DTO\Collection29|null
     */
    public $exceptions;

}
