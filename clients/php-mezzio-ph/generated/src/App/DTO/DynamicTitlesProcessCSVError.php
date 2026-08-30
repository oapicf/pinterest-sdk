<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DynamicTitlesProcessCSVError
{
    /**
     * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
     * @DTA\Data(field="error_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $error_type;

    /**
     * The row number with a validation error. -1 indicates a file-level error.
     * @DTA\Data(field="row_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $row_number;

}
