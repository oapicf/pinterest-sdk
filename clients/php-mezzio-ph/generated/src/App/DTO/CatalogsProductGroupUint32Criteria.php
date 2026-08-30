<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupUint32Criteria
{
    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $negated;

    /**
     * @DTA\Data(field="operator")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NumericFilterOperatorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NumericFilterOperatorType::class})
     * @var \App\DTO\NumericFilterOperatorType|null
     */
    public $operator;

    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":4294967295, "inclusive":true})
     * @var int|null
     */
    public $value;

}
