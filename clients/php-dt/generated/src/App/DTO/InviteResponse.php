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
     */
    public ?\App\DTO\InviteAssetsSummary $assets_summary = null;

    /**
     * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @DTA\Data(field="business_roles", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection370::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection370::class})
     */
    public ?\App\DTO\Collection370 $business_roles = null;

    /**
     * Metadata for the business that created the invite/request.
     * @DTA\Data(field="created_by_business", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $created_by_business = null;

    /**
     * Metadata for the user that created the invite/request.
     * @DTA\Data(field="created_by_user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $created_by_user = null;

    /**
     * The time the invite/request was created. Returned in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Unique identifier of the invite/request.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="invite_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteDataResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteDataResponse::class})
     */
    public ?\App\DTO\InviteDataResponse $invite_data = null;

    /**
     * Indicates whether the invite/request was received.
     * @DTA\Data(field="is_received_invite", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_received_invite = null;

    /**
     * Metadata for the member/partner that was sent the invite/request.
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $user = null;

}
