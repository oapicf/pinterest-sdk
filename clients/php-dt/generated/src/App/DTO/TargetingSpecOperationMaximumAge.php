<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TargetingSpecOperationMaximumAge
{
    /**
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $field = null;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $operation = null;

    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+\+?$/"})
     */
    public ?string $value = null;

}
