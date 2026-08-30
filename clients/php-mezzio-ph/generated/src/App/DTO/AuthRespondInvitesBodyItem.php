<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AuthRespondInvitesBodyItem
{
    /**
     * @DTA\Data(field="action")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuthRespondInviteAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuthRespondInviteAction::class})
     * @var \App\DTO\AuthRespondInviteAction|null
     */
    public $action;

    /**
     * Unique identifier of an invite.
     * @DTA\Data(field="invite_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":25})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $invite_id;

}
