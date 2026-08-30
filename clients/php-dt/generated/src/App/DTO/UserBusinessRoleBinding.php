<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UserBusinessRoleBinding
{
    /**
     * Ad accounts and profiles the business member/partner has access to.
     * @DTA\Data(field="assets_summary", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessMemberAssetsSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessMemberAssetsSummary::class})
     */
    public ?\App\DTO\BusinessMemberAssetsSummary $assets_summary = null;

    /**
     * The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @DTA\Data(field="business_roles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection326::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection326::class})
     */
    public ?\App\DTO\Collection326 $business_roles = null;

    /**
     * Metadata for the business that created the business relationship.
     * @DTA\Data(field="created_by_business", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $created_by_business = null;

    /**
     * Metadata for the user that created the business relationship.
     * @DTA\Data(field="created_by_user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $created_by_user = null;

    /**
     * The time the business relationship was created. Returned in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Unique identifier of the business member/business partner/employer.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.
     * @DTA\Data(field="is_shared_partner", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_shared_partner = null;

    /**
     * Metadata for the business member/business partner/employer.
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $user = null;

}
