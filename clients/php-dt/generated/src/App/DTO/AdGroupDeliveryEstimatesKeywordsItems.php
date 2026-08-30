<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupDeliveryEstimatesKeywordsItems
{
    /**
     * @DTA\Data(field="match_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullalbleMatchType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullalbleMatchType::class})
     */
    public ?\App\DTO\NullalbleMatchType $match_type = null;

    /**
     * Keyword value (120 chars max).
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

}
