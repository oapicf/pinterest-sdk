<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsRetailAvailableFilterValues
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="filter_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsRetailFilterValuesMap::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsRetailFilterValuesMap::class})
     */
    public ?\App\DTO\CatalogsRetailFilterValuesMap $filter_values = null;

}
