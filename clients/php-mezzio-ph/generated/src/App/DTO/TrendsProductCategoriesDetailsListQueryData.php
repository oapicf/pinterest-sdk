<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for trendsProductCategoriesDetailsList
 */
class TrendsProductCategoriesDetailsListQueryData
{
    /**
     * List of product categories
     * @DTA\Data(field="product_categories")
     * TODO add validator(s) and strategy for list of \App\DTO\ProductCategoryEnum::class and collection format multi inside query string
     * @var \App\DTO\ProductCategoryEnum[]|null
     */
    public $product_categories;

    /**
     * Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)
     * @DTA\Data(field="lookback_window", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $lookback_window;

    /**
     * Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
     * @DTA\Data(field="engagement_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $engagement_type;

    /**
     * The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $region;

}
