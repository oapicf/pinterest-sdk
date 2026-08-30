<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Key performance metrics highlights for this product category
 */
class ProductCategoriesMetricsHighlights
{
    /**
     * Engagement metric value
     * @DTA\Data(field="engagement", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InnerProductCategoriesMetricsHighlights::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InnerProductCategoriesMetricsHighlights::class})
     * @var \App\DTO\InnerProductCategoriesMetricsHighlights|null
     */
    public $engagement;

    /**
     * Number of outbound clicks
     * @DTA\Data(field="outbound_clicks", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InnerProductCategoriesMetricsHighlights::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InnerProductCategoriesMetricsHighlights::class})
     * @var \App\DTO\InnerProductCategoriesMetricsHighlights|null
     */
    public $outbound_clicks;

    /**
     * Number of pin saves
     * @DTA\Data(field="pin_saves", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InnerProductCategoriesMetricsHighlights::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InnerProductCategoriesMetricsHighlights::class})
     * @var \App\DTO\InnerProductCategoriesMetricsHighlights|null
     */
    public $pin_saves;

}
