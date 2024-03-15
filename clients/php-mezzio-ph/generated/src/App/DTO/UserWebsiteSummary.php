<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UserWebsiteSummary
{
    /**
     * Website with path or domain only
     * @DTA\Data(field="website", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $website;

    /**
     * Status of the verification process
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * UTC timestamp when the verification happened - sometimes missing
     * @DTA\Data(field="verified_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $verified_at;

}
