<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class TokenRevocationRequestCreate
{
    /**
     * The token to revoke.
     * @DTA\Data(field="token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $token = null;

    /**
     * The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
     * @DTA\Data(field="token_type_hint", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TokenTypeHint::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TokenTypeHint::class})
     */
    public ?\App\DTO\TokenTypeHint $token_type_hint = null;

}
