<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details about ineligible product tags in the request.
 */
class IneligibleProductTagsErrorDetails
{
    /**
     * List of product tags that failed eligibility check.
     * @DTA\Data(field="product_tags")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $product_tags = null;

}
