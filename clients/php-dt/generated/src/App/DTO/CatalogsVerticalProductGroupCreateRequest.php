<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object for creating a hotel product group.
 */
class CatalogsVerticalProductGroupCreateRequest
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelProductGroupFilters::class})
     */
    public ?\App\DTO\CatalogsHotelProductGroupFilters $filters = null;

    /**
     * Catalog id pertaining to the hotel product group.
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

}
