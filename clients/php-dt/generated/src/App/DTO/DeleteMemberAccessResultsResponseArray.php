<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DeleteMemberAccessResultsResponseArray
{
    /**
     * List of member asset permissions that were deleted.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection385::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection385::class})
     */
    public ?\App\DTO\Collection385 $items = null;

}
