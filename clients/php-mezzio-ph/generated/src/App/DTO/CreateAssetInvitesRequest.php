<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request body for updating asset roles for existing invites.
 */
class CreateAssetInvitesRequest
{
    /**
     * @DTA\Data(field="invites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection377::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection377::class})
     * @var \App\DTO\Collection377|null
     */
    public $invites;

}
