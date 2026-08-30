<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Body to be used on path to send Members or Partners Invite or Request
 */
class CreateMembershipOrPartnershipInvitesBody
{
    /**
     * @DTA\Data(field="business_role")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessRoleForInvite::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessRoleForInvite::class})
     * @var \App\DTO\BusinessRoleForInvite|null
     */
    public $business_role;

    /**
     * @DTA\Data(field="invite_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteType::class})
     * @var \App\DTO\InviteType|null
     */
    public $invite_type;

    /**
     * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
     * @DTA\Data(field="members", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection372::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection372::class})
     * @var \App\DTO\Collection372|null
     */
    public $members;

    /**
     * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
     * @DTA\Data(field="partners", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection373::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection373::class})
     * @var \App\DTO\Collection373|null
     */
    public $partners;

}
