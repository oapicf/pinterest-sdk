<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Product category details
 */
class ProductCategoryDetails
{
    /**
     * @DTA\Data(field="demographics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductCategoriesDemographic::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductCategoriesDemographic::class})
     * @var \App\DTO\ProductCategoriesDemographic|null
     */
    public $demographics;

    /**
     * Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
     * @DTA\Data(field="has_prediction")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_prediction;

    /**
     * @DTA\Data(field="metrics_highlights", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductCategoriesMetricsHighlights::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductCategoriesMetricsHighlights::class})
     * @var \App\DTO\ProductCategoriesMetricsHighlights|null
     */
    public $metrics_highlights;

    /**
     * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
     * @DTA\Data(field="predicted_time_series", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection475::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection475::class})
     * @var \App\DTO\Collection475|null
     */
    public $predicted_time_series;

    /**
     * @DTA\Data(field="product_category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductCategoryEnum::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductCategoryEnum::class})
     * @var \App\DTO\ProductCategoryEnum|null
     */
    public $product_category;

    /**
     * Related search terms for this product category
     * @DTA\Data(field="related_searches", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection476::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection476::class})
     * @var \App\DTO\Collection476|null
     */
    public $related_searches;

    /**
     * Time series data showing trend values over time, indexed between 0 and 100
     * @DTA\Data(field="time_series", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection477::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection477::class})
     * @var \App\DTO\Collection477|null
     */
    public $time_series;

}
