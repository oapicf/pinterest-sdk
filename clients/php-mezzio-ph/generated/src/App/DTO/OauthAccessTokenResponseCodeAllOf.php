<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OauthAccessTokenResponseCodeAllOf
{
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
