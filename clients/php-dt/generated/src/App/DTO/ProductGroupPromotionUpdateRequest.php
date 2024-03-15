<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductGroupPromotionUpdateRequest
{
    /**
     * ID of the ad group the product group belongs to.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * @DTA\Data(field="product_group_promotion")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection79::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection79::class})
     */
    public ?\App\DTO\Collection79 $product_group_promotion = null;

}
