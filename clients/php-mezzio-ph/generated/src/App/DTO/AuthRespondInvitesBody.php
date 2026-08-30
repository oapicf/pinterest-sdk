<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */
class AuthRespondInvitesBody
{
    /**
     * @DTA\Data(field="invites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection330::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection330::class})
     * @var \App\DTO\Collection330|null
     */
    public $invites;

}
