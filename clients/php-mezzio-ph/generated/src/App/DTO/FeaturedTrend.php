<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Featured trending topics for a specific interest and market
 */
class FeaturedTrend
{
    /**
     * The main interest category
     * @DTA\Data(field="interest")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InterestsEnum::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InterestsEnum::class})
     * @var \App\DTO\InterestsEnum|null
     */
    public $interest;

    /**
     * Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
     * @DTA\Data(field="market", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductCategoryRegion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductCategoryRegion::class})
     * @var \App\DTO\ProductCategoryRegion|null
     */
    public $market;

    /**
     * List of trending topics within this interest category
     * @DTA\Data(field="trends", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection488::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection488::class})
     * @var \App\DTO\Collection488|null
     */
    public $trends;

}
