<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsProductGroupFilterOperatorTypeCriteria
{
    /**
     * @DTA\Data(field="filter_operator_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FilterOperatorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FilterOperatorType::class})
     */
    public ?\App\DTO\FilterOperatorType $filter_operator_type = null;

    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $negated = null;

    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $values = null;

}
