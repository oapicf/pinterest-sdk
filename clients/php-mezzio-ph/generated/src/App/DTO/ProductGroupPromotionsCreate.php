<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class ProductGroupPromotionsCreate
{
    /**
     * ID of the ad group the product group promotion belongs to.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * List of product group promotions to create or update.
     * @DTA\Data(field="product_group_promotion")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection255::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection255::class})
     * @var \App\DTO\Collection255|null
     */
    public $product_group_promotion;

}
