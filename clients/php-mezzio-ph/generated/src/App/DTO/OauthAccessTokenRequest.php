<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes the valid schema for possible OAuth access token requests.
 */
class OauthAccessTokenRequest
{
    /**
     * @DTA\Data(field="grant_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $grant_type;

}
