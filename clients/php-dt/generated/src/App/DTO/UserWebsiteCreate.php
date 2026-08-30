<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class UserWebsiteCreate
{
    /**
     * Method used to verify website ownership.
     * @DTA\Data(field="verification_method", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WebsiteVerificationMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WebsiteVerificationMethod::class})
     */
    public ?\App\DTO\WebsiteVerificationMethod $verification_method = null;

    /**
     * Website with path or domain only
     * @DTA\Data(field="website", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $website = null;

}
