<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GoogleProductCategory6Filter
{
    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_6")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_6;

}
