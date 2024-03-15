<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UserWebsiteSummary
{
    /**
     * Website with path or domain only
     * @DTA\Data(field="website", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $website = null;

    /**
     * Status of the verification process
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * UTC timestamp when the verification happened - sometimes missing
     * @DTA\Data(field="verified_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $verified_at = null;

}
