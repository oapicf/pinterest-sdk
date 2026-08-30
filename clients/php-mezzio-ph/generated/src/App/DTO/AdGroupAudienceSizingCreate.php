<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class AdGroupAudienceSizingCreate
{
    /**
     * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @DTA\Data(field="creative_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection38::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection38::class})
     * @var \App\DTO\Collection38|null
     */
    public $creative_types;

    /**
     * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection39::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection39::class})
     * @var \App\DTO\Collection39|null
     */
    public $keywords;

    /**
     * [Placement group](/docs/redoc/#section/Placement-group).
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdgroupPlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdgroupPlacementGroupType::class})
     * @var \App\DTO\AdgroupPlacementGroupType|null
     */
    public $placement_group;

    /**
     * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection40::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection40::class})
     * @var \App\DTO\Collection40|null
     */
    public $product_group_ids;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @var \App\DTO\TargetingSpecOptimal|null
     */
    public $targeting_spec;

}
