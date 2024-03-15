<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A request to exchange an authorization code for an access token.
 */
class OauthAccessTokenRequestCode
{
    /**
     * @DTA\Data(field="grant_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $grant_type = null;

    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code = null;

    /**
     * @DTA\Data(field="redirect_uri")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $redirect_uri = null;

}
