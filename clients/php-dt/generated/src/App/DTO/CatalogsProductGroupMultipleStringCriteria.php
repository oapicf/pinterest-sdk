<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupMultipleStringCriteria
{
    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $values;

    /**
     * @DTA\Data(field="negated")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $negated;

}
