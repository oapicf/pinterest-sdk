<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OauthAccessTokenRequestCodeAllOf
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code;

    /**
     * @DTA\Data(field="redirect_uri")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $redirect_uri;

}
