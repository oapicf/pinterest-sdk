<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductGroupPromotionCreateRequest
{
    /**
     * ID of the Ad Group the Product Group Promotion belongs to.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * @DTA\Data(field="product_group_promotion")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection72::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection72::class})
     */
    public ?\App\DTO\Collection72 $product_group_promotion = null;

}
