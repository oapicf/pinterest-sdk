<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UserBusinessRoleBinding
{
    /**
     * Ad accounts and profiles the business member/partner has access to.
     * @DTA\Data(field="assets_summary", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessMemberAssetsSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessMemberAssetsSummary::class})
     * @var \App\DTO\BusinessMemberAssetsSummary|null
     */
    public $assets_summary;

    /**
     * The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @DTA\Data(field="business_roles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection326::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection326::class})
     * @var \App\DTO\Collection326|null
     */
    public $business_roles;

    /**
     * Metadata for the business that created the business relationship.
     * @DTA\Data(field="created_by_business", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $created_by_business;

    /**
     * Metadata for the user that created the business relationship.
     * @DTA\Data(field="created_by_user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $created_by_user;

    /**
     * The time the business relationship was created. Returned in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Unique identifier of the business member/business partner/employer.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.
     * @DTA\Data(field="is_shared_partner", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_shared_partner;

    /**
     * Metadata for the business member/business partner/employer.
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $user;

}
