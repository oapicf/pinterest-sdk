<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdateBusinessMembershipsResponse
{
    /**
     * List of members with updated business access role.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection383::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection383::class})
     */
    public ?\App\DTO\Collection383 $items = null;

}
