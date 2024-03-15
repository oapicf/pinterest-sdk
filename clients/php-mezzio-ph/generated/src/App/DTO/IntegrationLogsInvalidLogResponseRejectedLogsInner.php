<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class IntegrationLogsInvalidLogResponseRejectedLogsInner
{
    /**
     * Index of the log in the batch.
     * @DTA\Data(field="log_index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $log_index;

    /**
     * The field name containing an invalid value.
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $field;

    /**
     * The value that is invalid.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

    /**
     * The reason the value is invalid.
     * @DTA\Data(field="reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $reason;

}
