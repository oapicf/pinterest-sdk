<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AuthRespondInvitesBodyItem
{
    /**
     * @DTA\Data(field="action")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuthRespondInviteAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuthRespondInviteAction::class})
     */
    public ?\App\DTO\AuthRespondInviteAction $action = null;

    /**
     * Unique identifier of an invite.
     * @DTA\Data(field="invite_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":25})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $invite_id = null;

}
