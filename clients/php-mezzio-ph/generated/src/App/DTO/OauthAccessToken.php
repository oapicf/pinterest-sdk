<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes the valid schema for possible OAuth access token requests.
 */
class OauthAccessToken
{
    /**
     * @DTA\Data(field="access_token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $access_token;

    /**
     * @DTA\Data(field="expires_in")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_in;

    /**
     * @DTA\Data(field="refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $refresh_token;

    /**
     * @DTA\Data(field="refresh_token_expires_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $refresh_token_expires_at;

    /**
     * @DTA\Data(field="refresh_token_expires_in", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $refresh_token_expires_in;

    /**
     * @DTA\Data(field="response_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TokenGrantType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TokenGrantType::class})
     * @var \App\DTO\TokenGrantType|null
     */
    public $response_type;

    /**
     * @DTA\Data(field="scope", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $scope;

    /**
     * @DTA\Data(field="token_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $token_type;

}
