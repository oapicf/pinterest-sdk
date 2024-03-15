<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeywordsCommon
{
    /**
     * Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @DTA\Data(field="bid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bid;

    /**
     * @DTA\Data(field="match_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MatchTypeResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MatchTypeResponse::class})
     * @var \App\DTO\MatchTypeResponse|null
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
