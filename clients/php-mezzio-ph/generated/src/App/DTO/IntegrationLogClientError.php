<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * System error details included in the log sent by the client.
 */
class IntegrationLogClientError
{
    /**
     * Original cause of the error.
     * @DTA\Data(field="cause", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":512})
     * @var string|null
     */
    public $cause;

    /**
     * Column number in the line of the file that raised the error.
     * @DTA\Data(field="column_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $column_number;

    /**
     * Filename where the error happened.
     * @DTA\Data(field="file_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":256})
     * @var string|null
     */
    public $file_name;

    /**
     * Line number where the error happened.
     * @DTA\Data(field="line_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $line_number;

    /**
     * Human-readable description of the error.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":512})
     * @var string|null
     */
    public $message;

    /**
     * More detail about the message.
     * @DTA\Data(field="message_detail", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":1024})
     * @var string|null
     */
    public $message_detail;

    /**
     * Filename where the error happened.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":256})
     * @var string|null
     */
    public $name;

    /**
     * Integer that specifies the error code.
     * @DTA\Data(field="number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $number;

    /**
     * Stack trace of where the error happened.
     * @DTA\Data(field="stack_trace", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $stack_trace;

}
