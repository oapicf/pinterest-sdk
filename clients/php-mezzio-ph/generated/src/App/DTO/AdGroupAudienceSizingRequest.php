<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdGroupAudienceSizingRequest
{
    /**
     * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     * @var \App\DTO\PlacementGroupType|null
     */
    public $placement_group;

    /**
     * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @DTA\Data(field="creative_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     * @var \App\DTO\Collection16|null
     */
    public $creative_types;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpec::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpec::class})
     * @var \App\DTO\TargetingSpec|null
     */
    public $targeting_spec;

    /**
     * Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection29::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection29::class})
     * @var \App\DTO\Collection29|null
     */
    public $product_group_ids;

    /**
     * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection30::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection30::class})
     * @var \App\DTO\Collection30|null
     */
    public $keywords;

}
