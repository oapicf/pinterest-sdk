<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CancelInviteResult
{
    /**
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
     * @DTA\Data(field="is_received_invite", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_received_invite;

    /**
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CancelInviteResultUser::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CancelInviteResultUser::class})
     * @var \App\DTO\CancelInviteResultUser|null
     */
    public $user;

}
