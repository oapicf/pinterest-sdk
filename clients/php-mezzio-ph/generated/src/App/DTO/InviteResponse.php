<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A user&#39;s username or email OR a partner id that caused the error.
 */
class InviteResponse
{
    /**
     * @DTA\Data(field="assets_summary", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteAssetsSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteAssetsSummary::class})
     * @var \App\DTO\InviteAssetsSummary|null
     */
    public $assets_summary;

    /**
     * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @DTA\Data(field="business_roles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection370::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection370::class})
     * @var \App\DTO\Collection370|null
     */
    public $business_roles;

    /**
     * Metadata for the business that created the invite/request.
     * @DTA\Data(field="created_by_business", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $created_by_business;

    /**
     * Metadata for the user that created the invite/request.
     * @DTA\Data(field="created_by_user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $created_by_user;

    /**
     * The time the invite/request was created. Returned in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Unique identifier of the invite/request.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="invite_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteDataResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteDataResponse::class})
     * @var \App\DTO\InviteDataResponse|null
     */
    public $invite_data;

    /**
     * Indicates whether the invite/request was received.
     * @DTA\Data(field="is_received_invite", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_received_invite;

    /**
     * Metadata for the member/partner that was sent the invite/request.
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $user;

}
