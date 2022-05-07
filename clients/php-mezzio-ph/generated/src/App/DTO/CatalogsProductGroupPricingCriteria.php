<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupPricingCriteria
{
    /**
     * @DTA\Data(field="inclusion")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $inclusion;

    /**
     * @DTA\Data(field="values")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $values;

    /**
     * @DTA\Data(field="negated")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $negated;

}
