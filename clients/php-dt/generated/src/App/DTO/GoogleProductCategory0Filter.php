<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GoogleProductCategory0Filter
{
    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_0 = null;

}
