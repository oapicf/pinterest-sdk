<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RespondToInviteResultItem
{
    /**
     * @DTA\Data(field="exception", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteExceptionResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteExceptionResponse::class})
     */
    public ?\App\DTO\InviteExceptionResponse $exception = null;

    /**
     * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
     * @DTA\Data(field="invite", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BaseInviteDataResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BaseInviteDataResponse::class})
     */
    public ?\App\DTO\BaseInviteDataResponse $invite = null;

}
