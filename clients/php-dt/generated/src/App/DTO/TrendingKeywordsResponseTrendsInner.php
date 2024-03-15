<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TrendingKeywordsResponseTrendsInner
{
    /**
     * The keyword that is trending.
     * @DTA\Data(field="keyword", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1})
     */
    public ?string $keyword = null;

    /**
     * The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.
     * @DTA\Data(field="pct_growth_wow", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pct_growth_wow = null;

    /**
     * The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.
     * @DTA\Data(field="pct_growth_mom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pct_growth_mom = null;

    /**
     * The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.
     * @DTA\Data(field="pct_growth_yoy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pct_growth_yoy = null;

    /**
     * @DTA\Data(field="time_series", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrendingKeywordsResponseTrendsInnerTimeSeries::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrendingKeywordsResponseTrendsInnerTimeSeries::class})
     */
    public ?\App\DTO\TrendingKeywordsResponseTrendsInnerTimeSeries $time_series = null;

}
