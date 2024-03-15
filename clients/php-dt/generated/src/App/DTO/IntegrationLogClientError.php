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
     * @DTA\Validator(name="Length", options={"max":512})
     */
    public ?string $cause = null;

    /**
     * Column number in the line of the file that raised the error.
     * @DTA\Data(field="column_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $column_number = null;

    /**
     * Filename where the error happened.
     * @DTA\Data(field="file_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $file_name = null;

    /**
     * Line number where the error happened.
     * @DTA\Data(field="line_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $line_number = null;

    /**
     * Human-readable description of the error.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":512})
     */
    public ?string $message = null;

    /**
     * More detail about the message.
     * @DTA\Data(field="message_detail", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":1024})
     */
    public ?string $message_detail = null;

    /**
     * Filename where the error happened.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $name = null;

    /**
     * Integer that specifies the error code.
     * @DTA\Data(field="number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $number = null;

    /**
     * Stack trace of where the error happened.
     * @DTA\Data(field="stack_trace", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $stack_trace = null;

}
