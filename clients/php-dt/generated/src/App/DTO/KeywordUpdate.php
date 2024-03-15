<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class KeywordUpdate
{
    /**
     * Keyword ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Is keyword archived?
     * @DTA\Data(field="archived", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $archived = null;

    /**
     * Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @DTA\Data(field="bid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $bid = null;

}
