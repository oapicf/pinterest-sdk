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
     */
    public ?string $access_token = null;

    /**
     * @DTA\Data(field="expires_in")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $expires_in = null;

    /**
     * @DTA\Data(field="refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $refresh_token = null;

    /**
     * @DTA\Data(field="refresh_token_expires_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $refresh_token_expires_at = null;

    /**
     * @DTA\Data(field="refresh_token_expires_in", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $refresh_token_expires_in = null;

    /**
     * @DTA\Data(field="response_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TokenGrantType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TokenGrantType::class})
     */
    public ?\App\DTO\TokenGrantType $response_type = null;

    /**
     * @DTA\Data(field="scope", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $scope = null;

    /**
     * @DTA\Data(field="token_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $token_type = null;

}
