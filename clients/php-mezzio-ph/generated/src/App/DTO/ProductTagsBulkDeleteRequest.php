<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request body for bulk deleting product tags from a pin.
 */
class ProductTagsBulkDeleteRequest
{
    /**
     * List of product tags to delete.
     * @DTA\Data(field="product_tags")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection452::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection452::class})
     * @var \App\DTO\Collection452|null
     */
    public $product_tags;

}
