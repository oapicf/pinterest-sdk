<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class NotificationResponse
{
    /**
     * error message when success is false
     * @DTA\Data(field="error_msg", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $error_msg;

    /**
     * Received time. Unix timestamp in seconds.
     * @DTA\Data(field="received_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $received_at;

    /**
     * Returns true if the notification accepted.
     * @DTA\Data(field="success", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $success;

}
