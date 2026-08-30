<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ErrorDetail
{
    /**
     * Number of records with this error
     * @DTA\Data(field="count")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $count;

    /**
     * Numeric error code
     * @DTA\Data(field="error_code")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $error_code;

    /**
     * Error message description
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
