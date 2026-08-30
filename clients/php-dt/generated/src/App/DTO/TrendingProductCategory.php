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
     */
    public ?\App\DTO\ProductCategoriesEngagementType $engagement_type = null;

    /**
     * Month-over-month change percentage
     * @DTA\Data(field="pct_change_mom")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pct_change_mom = null;

    /**
     * Relative volume percentage
     * @DTA\Data(field="percent_relative_volume")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $percent_relative_volume = null;

    /**
     * Pinterest Product Category Id
     * @DTA\Data(field="pinterest_product_category_id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pinterest_product_category_id = null;

    /**
     * Product Category Name
     * @DTA\Data(field="product_category")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_category = null;

    /**
     * Vertical name associated with the product category
     * @DTA\Data(field="verticals", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection482::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection482::class})
     */
    public ?\App\DTO\Collection482 $verticals = null;

}
