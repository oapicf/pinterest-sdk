<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 */
class OauthAccessTokenResponseIntegrationRefresh
{
    /**
     * @DTA\Data(field="response_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_type;

    /**
     * @DTA\Data(field="access_token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $access_token;

    /**
     * @DTA\Data(field="token_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $token_type;

    /**
     * @DTA\Data(field="expires_in")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_in;

    /**
     * @DTA\Data(field="scope")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $scope;

    /**
     * @DTA\Data(field="refresh_token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $refresh_token;

    /**
     * @DTA\Data(field="refresh_token_expires_in")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $refresh_token_expires_in;

}
