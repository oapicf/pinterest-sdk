<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Keyword
{
    /**
     * @DTA\Data(field="archived", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $archived = null;

    /**
     * Keyword ID .
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Keyword parent entity ID (advertiser, campaign, ad group).
     * @DTA\Data(field="parent_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $parent_id = null;

    /**
     * Parent entity type
     * @DTA\Data(field="parent_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $parent_type = null;

    /**
     * Always keyword
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @DTA\Data(field="bid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bid = null;

    /**
     * @DTA\Data(field="match_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MatchTypeResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MatchTypeResponse::class})
     */
    public ?\App\DTO\MatchTypeResponse $match_type = null;

    /**
     * Keyword value (120 chars max).
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

}
