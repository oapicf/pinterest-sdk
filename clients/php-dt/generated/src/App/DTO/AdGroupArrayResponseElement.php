<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupArrayResponseElement
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdGroupResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdGroupResponse::class})
     */
    public ?\App\DTO\AdGroupResponse $data = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     */
    public ?\App\DTO\Collection5 $exceptions = null;

}
