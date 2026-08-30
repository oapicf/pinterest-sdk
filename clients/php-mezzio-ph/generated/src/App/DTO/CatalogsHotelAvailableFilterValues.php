<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsHotelAvailableFilterValues
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * @DTA\Data(field="filter_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelFilterValuesMap::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelFilterValuesMap::class})
     * @var \App\DTO\CatalogsHotelFilterValuesMap|null
     */
    public $filter_values;

}
