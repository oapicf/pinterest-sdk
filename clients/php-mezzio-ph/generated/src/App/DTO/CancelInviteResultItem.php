<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CancelInviteResultItem
{
    /**
     * @DTA\Data(field="exception", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CancelInviteException::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CancelInviteException::class})
     * @var \App\DTO\CancelInviteException|null
     */
    public $exception;

    /**
     * @DTA\Data(field="invite", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CancelInviteResult::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CancelInviteResult::class})
     * @var \App\DTO\CancelInviteResult|null
     */
    public $invite;

}
