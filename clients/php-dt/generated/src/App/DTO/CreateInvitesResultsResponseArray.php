<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateInvitesResultsResponseArray
{
    /**
     * List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection374::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection374::class})
     */
    public ?\App\DTO\Collection374 $items = null;

}
