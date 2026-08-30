<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class OauthAccessTokenCreate
{
    /**
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code = null;

    /**
     * If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
     * @DTA\Data(field="continuous_refresh", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $continuous_refresh = null;

    /**
     * @DTA\Data(field="grant_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TokenGrantType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TokenGrantType::class})
     */
    public ?\App\DTO\TokenGrantType $grant_type = null;

    /**
     * @DTA\Data(field="redirect_uri", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $redirect_uri = null;

    /**
     * @DTA\Data(field="refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $refresh_token = null;

    /**
     * @DTA\Data(field="scope", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $scope = null;

}
