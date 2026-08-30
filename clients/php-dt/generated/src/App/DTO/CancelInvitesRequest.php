<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object with the list of invite/request ids to cancel.
 */
class CancelInvitesRequest
{
    /**
     * A list of invite/request ids to cancel.
     * @DTA\Data(field="invite_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection375::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection375::class})
     */
    public ?\App\DTO\Collection375 $invite_ids = null;

}
