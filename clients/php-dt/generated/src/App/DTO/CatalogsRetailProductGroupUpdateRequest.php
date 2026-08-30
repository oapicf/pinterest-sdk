<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object for updating a retail product group.
 */
class CatalogsRetailProductGroupUpdateRequest
{
    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @DTA\Data(field="catalog_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="filters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFiltersRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFiltersRequest::class})
     */
    public ?\App\DTO\CatalogsProductGroupFiltersRequest $filters = null;

    /**
     * @DTA\Data(field="locale", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsLocale::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsLocale::class})
     */
    public ?\App\DTO\CatalogsLocale $locale = null;

    /**
     * Name of catalog product group
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
