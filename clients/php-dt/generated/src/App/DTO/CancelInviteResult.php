<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CancelInviteResult
{
    /**
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
     * @DTA\Data(field="is_received_invite", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_received_invite = null;

    /**
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CancelInviteResultUser::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CancelInviteResultUser::class})
     */
    public ?\App\DTO\CancelInviteResultUser $user = null;

}
