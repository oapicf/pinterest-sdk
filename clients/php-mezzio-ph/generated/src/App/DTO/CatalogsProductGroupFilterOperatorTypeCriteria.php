<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupFilterOperatorTypeCriteria
{
    /**
     * @DTA\Data(field="filter_operator_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FilterOperatorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FilterOperatorType::class})
     * @var \App\DTO\FilterOperatorType|null
     */
    public $filter_operator_type;

    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $negated;

    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $values;

}
