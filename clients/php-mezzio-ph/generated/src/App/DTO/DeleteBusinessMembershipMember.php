<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Single instance of a business member to be removed from the business.
 */
class DeleteBusinessMembershipMember
{
    /**
     * @DTA\Data(field="business_role")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessRoleForMembers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessRoleForMembers::class})
     * @var \App\DTO\BusinessRoleForMembers|null
     */
    public $business_role;

    /**
     * Unique identifier of the member
     * @DTA\Data(field="member_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":25})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $member_id;

}
