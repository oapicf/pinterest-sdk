<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
 */
class BusinessMembershipMember
{
    /**
     * @DTA\Data(field="business_role")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessRoleForMembers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessRoleForMembers::class})
     */
    public ?\App\DTO\BusinessRoleForMembers $business_role = null;

    /**
     * Unique identifier of the member.
     * @DTA\Data(field="member_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":25})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $member_id = null;

}
