<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TargetingSpecOperationAudienceInclude
{
    /**
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $field;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecListOperation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecListOperation::class})
     * @var \App\DTO\TargetingSpecListOperation|null
     */
    public $operation;

    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $values;

}
