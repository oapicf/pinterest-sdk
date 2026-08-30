<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductType1Filter
{
    /**
     * @DTA\Data(field="PRODUCT_TYPE_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $product_type_1 = null;

}
