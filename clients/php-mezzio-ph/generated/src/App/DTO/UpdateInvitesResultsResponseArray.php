<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdateInvitesResultsResponseArray
{
    /**
     * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection378::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection378::class})
     * @var \App\DTO\Collection378|null
     */
    public $items;

}
