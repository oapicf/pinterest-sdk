<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
class InviteBusinessRoleBinding
{
    /**
     * Unique identifier for the business that created the invite/request.
     * @DTA\Data(field="created_by_business_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $created_by_business_id = null;

    /**
     * Unique identifier for the user that created the invite/request.
     * @DTA\Data(field="created_by_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $created_by_user_id = null;

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
