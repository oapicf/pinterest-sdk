<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */
class InviteActionResultItem
{
    /**
     * @DTA\Data(field="exception", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteExceptionResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteExceptionResponse::class})
     */
    public ?\App\DTO\InviteExceptionResponse $exception = null;

    /**
     * @DTA\Data(field="invite", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InviteBusinessRoleBinding::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InviteBusinessRoleBinding::class})
     */
    public ?\App\DTO\InviteBusinessRoleBinding $invite = null;

}
