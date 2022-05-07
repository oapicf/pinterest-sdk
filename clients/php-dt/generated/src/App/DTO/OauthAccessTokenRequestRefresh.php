<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A request to exchange a refresh token for a new access token.
 */
class OauthAccessTokenRequestRefresh
{
    /**
     * @DTA\Data(field="grant_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $grant_type;

    /**
     * @DTA\Data(field="refresh_token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $refresh_token;

    /**
     * @DTA\Data(field="scope", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $scope;

}
