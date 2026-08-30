<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A successful conversion access token response.
 */
class ConversionAccessToken
{
    /**
     * @DTA\Data(field="access_token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $access_token = null;

    /**
     * @DTA\Data(field="token_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $token_type = null;

}
