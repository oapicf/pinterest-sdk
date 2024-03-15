<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsItemValidationDetails
{
    /**
     * @DTA\Data(field="attribute_name")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableCatalogsItemFieldType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableCatalogsItemFieldType::class})
     * @var \App\DTO\NullableCatalogsItemFieldType|null
     */
    public $attribute_name;

    /**
     * Provided value that caused the validation issue.
     * @DTA\Data(field="provided_value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $provided_value;

}
