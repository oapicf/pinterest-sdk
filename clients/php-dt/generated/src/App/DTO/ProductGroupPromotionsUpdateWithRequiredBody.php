<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
class ProductGroupPromotionsUpdateWithRequiredBody
{
    /**
     * ID of the ad group the product group promotion belongs to.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * List of product group promotions to create or update.
     * @DTA\Data(field="product_group_promotion")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection258::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection258::class})
     */
    public ?\App\DTO\Collection258 $product_group_promotion = null;

}
