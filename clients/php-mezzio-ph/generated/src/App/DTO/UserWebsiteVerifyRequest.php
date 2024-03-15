<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * User website verification request
 */
class UserWebsiteVerifyRequest
{
    /**
     * @DTA\Data(field="website", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $website;

    /**
     * @DTA\Data(field="verification_method", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $verification_method;

}
