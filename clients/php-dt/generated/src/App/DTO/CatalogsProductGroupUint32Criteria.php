<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsProductGroupUint32Criteria
{
    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $negated = null;

    /**
     * @DTA\Data(field="operator")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NumericFilterOperatorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NumericFilterOperatorType::class})
     */
    public ?\App\DTO\NumericFilterOperatorType $operator = null;

    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":4294967295})
     */
    public ?int $value = null;

}
