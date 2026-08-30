<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdsAnalyticsCreateAsyncRequest
{
    /**
     * List of ad group ids
     * @DTA\Data(field="ad_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection270::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection270::class})
     */
    public ?\App\DTO\Collection270 $ad_group_ids = null;

    /**
     * List of values for filtering
     * @DTA\Data(field="ad_group_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection271::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection271::class})
     */
    public ?\App\DTO\Collection271 $ad_group_statuses = null;

    /**
     * List of ad ids. This parameter is not supported for Product Item level reports.
     * @DTA\Data(field="ad_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection272::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection272::class})
     */
    public ?\App\DTO\Collection272 $ad_ids = null;

    /**
     * List of values for filtering. This parameter is not supported for Product Item level reports.
     * @DTA\Data(field="ad_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection273::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection273::class})
     */
    public ?\App\DTO\Collection273 $ad_statuses = null;

    /**
     * List of attribution types for the conversion report.
     * @DTA\Data(field="attribution_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection274::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection274::class})
     */
    public ?\App\DTO\Collection274 $attribution_types = null;

    /**
     * Campaign brand label for filtering.
     * @DTA\Data(field="campaign_brand_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $campaign_brand_label = null;

    /**
     * Campaign custom label for filtering.
     * @DTA\Data(field="campaign_custom_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $campaign_custom_label = null;

    /**
     * List of campaign ids
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection275::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection275::class})
     */
    public ?\App\DTO\Collection275 $campaign_ids = null;

    /**
     * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
     * @DTA\Data(field="campaign_objective_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection276::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection276::class})
     */
    public ?\App\DTO\Collection276 $campaign_objective_types = null;

    /**
     * List of status values for filtering
     * @DTA\Data(field="campaign_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection277::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection277::class})
     */
    public ?\App\DTO\Collection277 $campaign_statuses = null;

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     */
    public ?\App\DTO\ConversionAttributionWindowDays $click_window_days = null;

    /**
     * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
     * @DTA\Data(field="columns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection278::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection278::class})
     */
    public ?\App\DTO\Collection278 $columns = null;

    /**
     * Determines if the targeting types included in the request should be consolidated into a single breakdown.
     * @DTA\Data(field="combine_targeting_types", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $combine_targeting_types = null;

    /**
     * Date dimension for conversion metrics.
     * @DTA\Data(field="conversion_report_time", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionReportTimeType::class})
     */
    public ?\App\DTO\ConversionReportTimeType $conversion_report_time = null;

    /**
     * List of advertiser-defined custom conversion event metrics to include in the report
     * @DTA\Data(field="custom_conversion_event_metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection279::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection279::class})
     */
    public ?\App\DTO\Collection279 $custom_conversion_event_metrics = null;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $end_date = null;

    /**
     * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
     * @DTA\Data(field="end_hour", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":23})
     */
    public ?int $end_hour = null;

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     */
    public ?\App\DTO\ConversionAttributionWindowDays $engagement_window_days = null;

    /**
     * TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
     * @DTA\Data(field="granularity")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Granularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Granularity::class})
     */
    public ?\App\DTO\Granularity $granularity = null;

    /**
     * Level of the report
     * @DTA\Data(field="level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MetricsReportingLevel::class})
     */
    public ?\App\DTO\MetricsReportingLevel $level = null;

    /**
     * List of metrics filters
     * @DTA\Data(field="metrics_filters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection281::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection281::class})
     */
    public ?\App\DTO\Collection281 $metrics_filters = null;

    /**
     * @DTA\Data(field="primary_sort", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PrimarySort::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PrimarySort::class})
     */
    public ?\App\DTO\PrimarySort $primary_sort = null;

    /**
     * List of product group ids
     * @DTA\Data(field="product_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection282::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection282::class})
     */
    public ?\App\DTO\Collection282 $product_group_ids = null;

    /**
     * List of values for filtering
     * @DTA\Data(field="product_group_statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection283::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection283::class})
     */
    public ?\App\DTO\Collection283 $product_group_statuses = null;

    /**
     * List of product item ids
     * @DTA\Data(field="product_item_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection284::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection284::class})
     */
    public ?\App\DTO\Collection284 $product_item_ids = null;

    /**
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataOutputFormat::class})
     */
    public ?\App\DTO\DataOutputFormat $report_format = null;

    /**
     * Specify the timezone to be applied for the reporting.
     * @DTA\Data(field="reporting_timezone", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReportingTimeZone::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReportingTimeZone::class})
     */
    public ?\App\DTO\ReportingTimeZone $reporting_timezone = null;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $start_date = null;

    /**
     * Which hour of the start date to begin the report. Only allowed for hourly reports.
     * @DTA\Data(field="start_hour", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":23})
     */
    public ?int $start_hour = null;

    /**
     * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
     * @DTA\Data(field="targeting_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection285::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection285::class})
     */
    public ?\App\DTO\Collection285 $targeting_types = null;

    /**
     * Number of days to use as the conversion attribution window for a view action.
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     */
    public ?\App\DTO\ConversionAttributionWindowDays $view_window_days = null;

}
