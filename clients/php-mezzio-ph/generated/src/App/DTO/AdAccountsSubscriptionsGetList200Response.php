<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountsSubscriptionsGetList200Response
{
    /**
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $bookmark;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection240::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection240::class})
     * @var \App\DTO\Collection240|null
     */
    public $items;

}
