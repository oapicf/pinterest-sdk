<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response containing a list of product tags for a pin.
 */
class ProductTagsResponse
{
    /**
     * List of product tags on the pin.
     * @DTA\Data(field="product_tags")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection450::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection450::class})
     */
    public ?\App\DTO\Collection450 $product_tags = null;

}
