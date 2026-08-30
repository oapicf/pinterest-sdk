<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for trendsProductCategoriesTrendingList
 */
class TrendsProductCategoriesTrendingListQueryData
{
    /**
     * Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
     * @DTA\Data(field="engagement_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $engagement_type;

    /**
     * Age to filter by. If not provided, the results will be filtered by all ages.
     * @DTA\Data(field="ages", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\AgeTrendsBucket::class and collection format multi inside query string
     * @var \App\DTO\AgeTrendsBucket[]|null
     */
    public $ages;

    /**
     * Gender to filter by, If not provided, the results will be filtered by all genders.
     * @DTA\Data(field="genders", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\GenderBucket::class and collection format multi inside query string
     * @var \App\DTO\GenderBucket[]|null
     */
    public $genders;

    /**
     * The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $region;

    /**
     * List of verticals to filter by
     * @DTA\Data(field="verticals", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\VerticalProductCategory::class and collection format multi inside query string
     * @var \App\DTO\VerticalProductCategory[]|null
     */
    public $verticals;

}
