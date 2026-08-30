<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CancelInviteResultItem
{
    /**
     * @DTA\Data(field="exception", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CancelInviteException::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CancelInviteException::class})
     */
    public ?\App\DTO\CancelInviteException $exception = null;

    /**
     * @DTA\Data(field="invite", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CancelInviteResult::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CancelInviteResult::class})
     */
    public ?\App\DTO\CancelInviteResult $invite = null;

}
