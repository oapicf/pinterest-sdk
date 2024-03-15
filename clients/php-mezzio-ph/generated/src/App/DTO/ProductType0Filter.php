<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProductType0Filter
{
    /**
     * @DTA\Data(field="PRODUCT_TYPE_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $product_type_0;

}
