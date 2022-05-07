<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The counts can be null early in the process.
 */
class CatalogsFeedProductCounts
{
    /**
     * The number of products in the feed file
     * @DTA\Data(field="original", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $original;

}
