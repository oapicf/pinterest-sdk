<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for trendingKeywordsList
 */
class TrendingKeywordsListQueryData
{
    /**
     * Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
     * @DTA\Data(field="normalize_against_group", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $normalize_against_group;

    /**
     * The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":50, "inclusive":true})
     * @var int|null
     */
    public $limit;

    /**
     * If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
     * @DTA\Data(field="ages", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\TrendsAgeBucket::class and collection format multi inside query string
     * @var \App\DTO\TrendsAgeBucket[]|null
     */
    public $ages;

    /**
     * If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.
     * @DTA\Data(field="genders", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\TrendsGenderFilter::class and collection format multi inside query string
     * @var \App\DTO\TrendsGenderFilter[]|null
     */
    public $genders;

    /**
     * If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
     * @DTA\Data(field="include_keywords", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":50})
     * @var string[]|null
     */
    public $include_keywords;

    /**
     * The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion
     * @DTA\Data(field="interests", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\TrendsL1Interest::class and collection format multi inside query string
     * @var \App\DTO\TrendsL1Interest[]|null
     */
    public $interests;

    /**
     * Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data.
     * @DTA\Data(field="include_demographics", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $include_demographics;

}
