<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Trending shopping product category
 */
class TrendingProductCategory
{
    /**
     * Engagement type
     * @DTA\Data(field="engagement_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductCategoriesEngagementType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductCategoriesEngagementType::class})
     * @var \App\DTO\ProductCategoriesEngagementType|null
     */
    public $engagement_type;

    /**
     * Month-over-month change percentage
     * @DTA\Data(field="pct_change_mom")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pct_change_mom;

    /**
     * Relative volume percentage
     * @DTA\Data(field="percent_relative_volume")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $percent_relative_volume;

    /**
     * Pinterest Product Category Id
     * @DTA\Data(field="pinterest_product_category_id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pinterest_product_category_id;

    /**
     * Product Category Name
     * @DTA\Data(field="product_category")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_category;

    /**
     * Vertical name associated with the product category
     * @DTA\Data(field="verticals", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection482::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection482::class})
     * @var \App\DTO\Collection482|null
     */
    public $verticals;

}
