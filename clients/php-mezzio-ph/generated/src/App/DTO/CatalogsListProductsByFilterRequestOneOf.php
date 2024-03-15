<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object to list products for a given feed_id and product group filter.
 */
class CatalogsListProductsByFilterRequestOneOf
{
    /**
     * Catalog Feed id pertaining to the catalog product group filter.
     * @DTA\Data(field="feed_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $feed_id;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @var \App\DTO\CatalogsProductGroupFilters|null
     */
    public $filters;

}
