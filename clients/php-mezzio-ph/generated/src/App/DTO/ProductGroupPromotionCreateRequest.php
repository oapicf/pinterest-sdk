<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProductGroupPromotionCreateRequest
{
    /**
     * ID of the Ad Group the Product Group Promotion belongs to.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * @DTA\Data(field="product_group_promotion")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection72::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection72::class})
     * @var \App\DTO\Collection72|null
     */
    public $product_group_promotion;

}
