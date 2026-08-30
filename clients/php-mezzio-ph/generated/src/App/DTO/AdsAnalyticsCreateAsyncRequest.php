<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdsAnalyticsCreateAsyncRequest
{
    /**
     * List of ad group ids
     * @DTA\Data(field="ad_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection270::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection270::class})
     * @var \App\DTO\Collection270|null
     */
    public $ad_group_ids;

    /**
     * List of values for filtering
     * @DTA\Data(field="ad_group_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection271::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection271::class})
     * @var \App\DTO\Collection271|null
     */
    public $ad_group_statuses;

    /**
     * List of ad ids. This parameter is not supported for Product Item level reports.
     * @DTA\Data(field="ad_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection272::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection272::class})
     * @var \App\DTO\Collection272|null
     */
    public $ad_ids;

    /**
     * List of values for filtering. This parameter is not supported for Product Item level reports.
     * @DTA\Data(field="ad_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection273::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection273::class})
     * @var \App\DTO\Collection273|null
     */
    public $ad_statuses;

    /**
     * List of attribution types for the conversion report.
     * @DTA\Data(field="attribution_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection274::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection274::class})
     * @var \App\DTO\Collection274|null
     */
    public $attribution_types;

    /**
     * Campaign brand label for filtering.
     * @DTA\Data(field="campaign_brand_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $campaign_brand_label;

    /**
     * Campaign custom label for filtering.
     * @DTA\Data(field="campaign_custom_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $campaign_custom_label;

    /**
     * List of campaign ids
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection275::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection275::class})
     * @var \App\DTO\Collection275|null
     */
    public $campaign_ids;

    /**
     * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
     * @DTA\Data(field="campaign_objective_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection276::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection276::class})
     * @var \App\DTO\Collection276|null
     */
    public $campaign_objective_types;

    /**
     * List of status values for filtering
     * @DTA\Data(field="campaign_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection277::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection277::class})
     * @var \App\DTO\Collection277|null
     */
    public $campaign_statuses;

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $click_window_days;

    /**
     * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
     * @DTA\Data(field="columns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection278::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection278::class})
     * @var \App\DTO\Collection278|null
     */
    public $columns;

    /**
     * Determines if the targeting types included in the request should be consolidated into a single breakdown.
     * @DTA\Data(field="combine_targeting_types", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $combine_targeting_types;

    /**
     * Date dimension for conversion metrics.
     * @DTA\Data(field="conversion_report_time", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @var \App\DTO\ConversionReportTimeType|null
     */
    public $conversion_report_time;

    /**
     * List of advertiser-defined custom conversion event metrics to include in the report
     * @DTA\Data(field="custom_conversion_event_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection279::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection279::class})
     * @var \App\DTO\Collection279|null
     */
    public $custom_conversion_event_metrics;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
     * @DTA\Data(field="end_hour", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":23, "inclusive":true})
     * @var int|null
     */
    public $end_hour;

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $engagement_window_days;

    /**
     * TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
     * @DTA\Data(field="granularity")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Granularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Granularity::class})
     * @var \App\DTO\Granularity|null
     */
    public $granularity;

    /**
     * Level of the report
     * @DTA\Data(field="level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @var \App\DTO\MetricsReportingLevel|null
     */
    public $level;

    /**
     * List of metrics filters
     * @DTA\Data(field="metrics_filters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection281::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection281::class})
     * @var \App\DTO\Collection281|null
     */
    public $metrics_filters;

    /**
     * @DTA\Data(field="primary_sort", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PrimarySort::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PrimarySort::class})
     * @var \App\DTO\PrimarySort|null
     */
    public $primary_sort;

    /**
     * List of product group ids
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection282::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection282::class})
     * @var \App\DTO\Collection282|null
     */
    public $product_group_ids;

    /**
     * List of values for filtering
     * @DTA\Data(field="product_group_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection283::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection283::class})
     * @var \App\DTO\Collection283|null
     */
    public $product_group_statuses;

    /**
     * List of product item ids
     * @DTA\Data(field="product_item_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection284::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection284::class})
     * @var \App\DTO\Collection284|null
     */
    public $product_item_ids;

    /**
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataOutputFormat::class})
     * @var \App\DTO\DataOutputFormat|null
     */
    public $report_format;

    /**
     * Specify the timezone to be applied for the reporting.
     * @DTA\Data(field="reporting_timezone", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReportingTimeZone::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReportingTimeZone::class})
     * @var \App\DTO\ReportingTimeZone|null
     */
    public $reporting_timezone;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $start_date;

    /**
     * Which hour of the start date to begin the report. Only allowed for hourly reports.
     * @DTA\Data(field="start_hour", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":23, "inclusive":true})
     * @var int|null
     */
    public $start_hour;

    /**
     * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
     * @DTA\Data(field="targeting_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection285::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection285::class})
     * @var \App\DTO\Collection285|null
     */
    public $targeting_types;

    /**
     * Number of days to use as the conversion attribution window for a view action.
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $view_window_days;

}
