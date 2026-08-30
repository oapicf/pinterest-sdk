<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupAudienceSizingKeyword
{
    /**
     * @DTA\Data(field="match_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MatchType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MatchType::class})
     */
    public ?\App\DTO\MatchType $match_type = null;

    /**
     * Keyword value (120 chars max).
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

}
