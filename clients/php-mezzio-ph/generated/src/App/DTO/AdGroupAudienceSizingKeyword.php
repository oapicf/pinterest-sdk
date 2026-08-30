<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdGroupAudienceSizingKeyword
{
    /**
     * @DTA\Data(field="match_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MatchType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MatchType::class})
     * @var \App\DTO\MatchType|null
     */
    public $match_type;

    /**
     * Keyword value (120 chars max).
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

}
