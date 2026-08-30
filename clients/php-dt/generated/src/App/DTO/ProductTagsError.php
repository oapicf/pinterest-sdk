<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Error response for requests containing ineligible product tags.
 */
class ProductTagsError
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $code = null;

    /**
     * Details about which product tags failed eligibility check.
     * @DTA\Data(field="details", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IneligibleProductTagsErrorDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IneligibleProductTagsErrorDetails::class})
     */
    public ?\App\DTO\IneligibleProductTagsErrorDetails $details = null;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
