<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsRetailAvailableFilterValues
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * @DTA\Data(field="filter_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsRetailFilterValuesMap::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsRetailFilterValuesMap::class})
     * @var \App\DTO\CatalogsRetailFilterValuesMap|null
     */
    public $filter_values;

}
