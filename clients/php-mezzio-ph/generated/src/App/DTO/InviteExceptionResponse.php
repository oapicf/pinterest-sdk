<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */
class InviteExceptionResponse
{
    /**
     * Error code associated with the error in performing the action on the invite/request.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $code;

    /**
     * Unique identifier of the invite/request.
     * @DTA\Data(field="invite_or_request_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $invite_or_request_id;

    /**
     * Error message associated with the error in performing the action on the invite/request.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

    /**
     * A list of users&#39; usernames or emails OR a list of partner ids that caused the error.
     * @DTA\Data(field="users_or_partner_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection331::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection331::class})
     * @var \App\DTO\Collection331|null
     */
    public $users_or_partner_ids;

}
