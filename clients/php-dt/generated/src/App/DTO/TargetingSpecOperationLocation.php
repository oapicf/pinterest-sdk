<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TargetingSpecOperationLocation
{
    /**
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $field = null;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecListOperation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecListOperation::class})
     */
    public ?\App\DTO\TargetingSpecListOperation $operation = null;

    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $values = null;

}
