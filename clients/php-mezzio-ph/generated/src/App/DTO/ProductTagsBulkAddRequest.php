<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request body for bulk adding product tags to a pin.
 */
class ProductTagsBulkAddRequest
{
    /**
     * List of product tags to add. Maximum 24 items allowed.
     * @DTA\Data(field="product_tags")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection451::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection451::class})
     * @var \App\DTO\Collection451|null
     */
    public $product_tags;

}
