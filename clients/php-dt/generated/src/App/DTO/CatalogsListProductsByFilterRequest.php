<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object to list products for a given product group filter.
 */
class CatalogsListProductsByFilterRequest
{
    /**
     * Catalog Feed id pertaining to the catalog product group filter.
     * @DTA\Data(field="feed_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $feed_id = null;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilters $filters = null;

}
