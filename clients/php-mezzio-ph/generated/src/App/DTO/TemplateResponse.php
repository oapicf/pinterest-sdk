<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Template fields
 */
class TemplateResponse
{
    /**
     * Template ID
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * ID of the Ad Account that owns the template
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * IDs of the Ad Accounts that have access to this template
     * @DTA\Data(field="ad_account_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $ad_account_ids;

    /**
     * ID of the user who created the template
     * @DTA\Data(field="user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $user_id;

    /**
     * Template Name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The number of days prior to the day the report will be delivered at which the report will start
     * @DTA\Data(field="report_start_relative_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $report_start_relative_days_in_past;

    /**
     * The number of days prior to the day the report will be delivered at which the report will end
     * @DTA\Data(field="report_end_relative_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $report_end_relative_days_in_past;

    /**
     * @DTA\Data(field="date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRange::class})
     * @var \App\DTO\TemplateResponseDateRange|null
     */
    public $date_range;

    /**
     * @DTA\Data(field="report_level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @var \App\DTO\MetricsReportingLevel|null
     */
    public $report_level;

    /**
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataOutputFormat::class})
     * @var \App\DTO\DataOutputFormat|null
     */
    public $report_format;

    /**
     * A list of columns to be included in the report
     * @DTA\Data(field="columns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $columns;

    /**
     * @DTA\Data(field="granularity", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Granularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Granularity::class})
     * @var \App\DTO\Granularity|null
     */
    public $granularity;

    /**
     * The length of the sliding window over which view conversions will be attributed
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $view_window_days;

    /**
     * The length of the sliding window over which click conversions will be attributed
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $click_window_days;

    /**
     * The length of the sliding window over which engagement conversions will be attributed
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $engagement_window_days;

    /**
     * Conversion report time type
     * @DTA\Data(field="conversion_report_time_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $conversion_report_time_type;

    /**
     * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values
     * @DTA\Data(field="filters_json", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $filters_json;

    /**
     * A boolean value that indicates if the user owns the template
     * @DTA\Data(field="is_owned_by_user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_owned_by_user;

    /**
     * A boolean value that indicates if this template has been used to create a scheduled report
     * @DTA\Data(field="is_scheduled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_scheduled;

    /**
     * The surface used to create this template
     * @DTA\Data(field="creation_source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $creation_source;

    /**
     * A boolean that indicates if the template has been deleted
     * @DTA\Data(field="is_deleted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_deleted;

    /**
     * Time of last update in seconds since Unix epoch
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $updated_time;

    /**
     * A list of custom column IDs
     * @DTA\Data(field="custom_column_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $custom_column_ids;

    /**
     * Reporting template type
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The filter on the conversion ingestion source method for conversion metrics
     * @DTA\Data(field="ingestion_sources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $ingestion_sources;

}
