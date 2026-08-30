<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * List of members with role to delete.
 */
class DeleteBusinessMembershipBody
{
    /**
     * @DTA\Data(field="members")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection380::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection380::class})
     */
    public ?\App\DTO\Collection380 $members = null;

}
