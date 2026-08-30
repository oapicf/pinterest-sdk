<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AccountTemplate
{
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection310::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection310::class})
     * @var \App\DTO\Collection310|null
     */
    public $ad_account_ids;

    /**
     * A list of ADE columns
     * @DTA\Data(field="ade_columns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection311::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection311::class})
     * @var \App\DTO\Collection311|null
     */
    public $ade_columns;

    /**
     * Attribution type for Brand/Category/SKU reports
     * @DTA\Data(field="attribution_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @var mixed|null
     */
    public $attribution_type;

    /**
     * The length of the sliding window over which click conversions will be attributed
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $click_window_days;

    /**
     * A list of columns to be included in the report
     * @DTA\Data(field="columns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection312::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection312::class})
     * @var \App\DTO\Collection312|null
     */
    public $columns;

    /**
     * Conversion report time type
     * @DTA\Data(field="conversion_report_time_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @var \App\DTO\ConversionReportTimeType|null
     */
    public $conversion_report_time_type;

    /**
     * The surface used to create this template
     * @DTA\Data(field="creation_source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreationSource::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreationSource::class})
     * @var \App\DTO\CreationSource|null
     */
    public $creation_source;

    /**
     * A list of custom column IDs
     * @DTA\Data(field="custom_column_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection313::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection313::class})
     * @var \App\DTO\Collection313|null
     */
    public $custom_column_ids;

    /**
     * Additional metadata about this reporting template
     * @DTA\Data(field="display_metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $display_metadata;

    /**
     * The length of the sliding window over which engagement conversions will be attributed
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $engagement_window_days;

    /**
     * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values
     * @DTA\Data(field="filters_json", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $filters_json;

    /**
     * @DTA\Data(field="granularity", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Granularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Granularity::class})
     * @var \App\DTO\Granularity|null
     */
    public $granularity;

    /**
     * Template ID
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The filter on the conversion ingestion source method for conversion metrics
     * @DTA\Data(field="ingestion_sources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection314::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection314::class})
     * @var \App\DTO\Collection314|null
     */
    public $ingestion_sources;

    /**
     * A boolean representing if this is the default view that loads for this template type
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_default;

    /**
     * A boolean that indicates if the template has been deleted
     * @DTA\Data(field="is_deleted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_deleted;

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
     * Template Name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The number of days prior to the day the report will be delivered at which the report will end
     * @DTA\Data(field="report_end_relative_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $report_end_relative_days_in_past;

    /**
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataOutputFormat::class})
     * @var \App\DTO\DataOutputFormat|null
     */
    public $report_format;

    /**
     * @DTA\Data(field="report_level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @var \App\DTO\MetricsReportingLevel|null
     */
    public $report_level;

    /**
     * The number of days prior to the day the report will be delivered at which the report will start
     * @DTA\Data(field="report_start_relative_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $report_start_relative_days_in_past;

    /**
     * Timezone for reporting data
     * @DTA\Data(field="reporting_time_zone", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReportingTimeZone::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReportingTimeZone::class})
     * @var \App\DTO\ReportingTimeZone|null
     */
    public $reporting_time_zone;

    /**
     * Unified metric sort configuration
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @var mixed|null
     */
    public $sort_by;

    /**
     * Type of the template
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Time of last update in seconds since Unix epoch
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $updated_time;

    /**
     * ID of the user who created the template
     * @DTA\Data(field="user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $user_id;

    /**
     * The length of the sliding window over which view conversions will be attributed
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $view_window_days;

}
