<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TargetingSpecOperations
{
    /**
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $field;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $operation;

    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\TargetingSpecShoppingRetargeting[]|null
     */
    public $values;

    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+\\+?$/"})
     * @var string|null
     */
    public $value;

}
