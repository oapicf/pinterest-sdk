<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object of catalogs items
 */
class CatalogsItemsRequest
{
    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemsPostFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemsPostFilters::class})
     */
    public ?\App\DTO\CatalogsItemsPostFilters $filters = null;

    /**
     * We recommend using the CatalogsLocale values.
     * @DTA\Data(field="language")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $language = null;

}
