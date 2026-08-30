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
     * @var string|null
     */
    public $created_by_business_id;

    /**
     * Unique identifier for the user that created the invite/request.
     * @DTA\Data(field="created_by_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $created_by_user_id;

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
