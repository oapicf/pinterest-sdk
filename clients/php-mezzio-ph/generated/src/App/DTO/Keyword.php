<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Keyword
{
    /**
     * @DTA\Data(field="archived", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $archived;

    /**
     * Keyword ID .
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Keyword parent entity ID (advertiser, campaign, ad group).
     * @DTA\Data(field="parent_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $parent_id;

    /**
     * Parent entity type
     * @DTA\Data(field="parent_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $parent_type;

    /**
     * Always keyword
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

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
