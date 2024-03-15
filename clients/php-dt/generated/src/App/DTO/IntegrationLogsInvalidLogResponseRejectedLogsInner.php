<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class IntegrationLogsInvalidLogResponseRejectedLogsInner
{
    /**
     * Index of the log in the batch.
     * @DTA\Data(field="log_index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $log_index = null;

    /**
     * The field name containing an invalid value.
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $field = null;

    /**
     * The value that is invalid.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

    /**
     * The reason the value is invalid.
     * @DTA\Data(field="reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $reason = null;

}
