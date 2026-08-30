<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */
class CatalogsRetailListProductsByCatalogBasedFilterRequest
{
    /**
     * Catalog ID pertaining to the product group.
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilters $filters = null;

    /**
     * @DTA\Data(field="locale")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsLocale::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsLocale::class})
     */
    public ?\App\DTO\CatalogsLocale $locale = null;

}
