<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RespondToInvitesResponseArray
{
    /**
     * List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection332::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection332::class})
     */
    public ?\App\DTO\Collection332 $items = null;

}
