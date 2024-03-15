<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GoogleProductCategory5Filter
{
    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_5")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_5 = null;

}
