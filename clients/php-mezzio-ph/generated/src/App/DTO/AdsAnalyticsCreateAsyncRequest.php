<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdsAnalyticsCreateAsyncRequest
{
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $start_date;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @DTA\Data(field="granularity")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Granularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Granularity::class})
     * @var \App\DTO\Granularity|null
     */
    public $granularity;

    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $click_window_days;

    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $engagement_window_days;

    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $view_window_days;

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @DTA\Data(field="conversion_report_time", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @var \App\DTO\ConversionReportTimeType|null
     */
    public $conversion_report_time;

    /**
     * List of types of attribution for the conversion report
     * @DTA\Data(field="attribution_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ConversionReportAttributionType[]|null
     */
    public $attribution_types;

    /**
     * List of campaign ids
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $campaign_ids;

    /**
     * List of status values for filtering
     * @DTA\Data(field="campaign_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignSummaryStatus[]|null
     */
    public $campaign_statuses;

    /**
     * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA.
     * @DTA\Data(field="campaign_objective_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ObjectiveType[]|null
     */
    public $campaign_objective_types;

    /**
     * List of ad group ids
     * @DTA\Data(field="ad_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $ad_group_ids;

    /**
     * List of values for filtering
     * @DTA\Data(field="ad_group_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\AdGroupSummaryStatus[]|null
     */
    public $ad_group_statuses;

    /**
     * List of ad ids [This parameter is no supported for Product Item Level Reports]
     * @DTA\Data(field="ad_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $ad_ids;

    /**
     * List of values for filtering [This parameter is not supported for Product Item Level Reports]
     * @DTA\Data(field="ad_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\PinPromotionSummaryStatus[]|null
     */
    public $ad_statuses;

    /**
     * List of product group ids
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $product_group_ids;

    /**
     * List of values for filtering
     * @DTA\Data(field="product_group_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ProductGroupSummaryStatus[]|null
     */
    public $product_group_statuses;

    /**
     * List of product item ids
     * @DTA\Data(field="product_item_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $product_item_ids;

    /**
     * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
     * @DTA\Data(field="targeting_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\AdsAnalyticsTargetingType[]|null
     */
    public $targeting_types;

    /**
     * List of metrics filters
     * @DTA\Data(field="metrics_filters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\AdsAnalyticsMetricsFilter[]|null
     */
    public $metrics_filters;

    /**
     * Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ReportingColumnAsync[]|null
     */
    public $columns;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @var \App\DTO\MetricsReportingLevel|null
     */
    public $level;

    /**
     * Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataOutputFormat::class})
     * @var \App\DTO\DataOutputFormat|null
     */
    public $report_format;

}
