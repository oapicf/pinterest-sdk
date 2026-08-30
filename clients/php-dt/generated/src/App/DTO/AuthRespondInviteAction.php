<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AuthRespondInviteAction
{
    /**
     * Whether the invite/request is accepted.
     * @DTA\Data(field="accept_invite")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $accept_invite = null;

    /**
     * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     * @DTA\Data(field="asset_id_to_permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection329::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection329::class})
     */
    public ?\App\DTO\Collection329 $asset_id_to_permissions = null;

}
