<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PinterestProductCategoriesFilter
{
    /**
     * @DTA\Data(field="PINTEREST_PRODUCT_CATEGORIES")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultiplePinterestProductCategoryCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultiplePinterestProductCategoryCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultiplePinterestProductCategoryCriteria $pinterest_product_categories = null;

}
