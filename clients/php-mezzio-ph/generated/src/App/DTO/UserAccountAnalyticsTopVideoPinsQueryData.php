<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for user_account/analytics/top_video_pins
 */
class UserAccountAnalyticsTopVideoPinsQueryData
{
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @DTA\Data(field="end_date")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $end_date;

    /**
     * Metric types to get video data for, default is all.
     * @DTA\Data(field="metric_types", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $metric_types;

    /**
     * Filter to paid or organic data. Default is all.
     * @DTA\Data(field="content_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $content_type;

    /**
     * Number of pins to include, default is 10. Max is 50.
     * @DTA\Data(field="num_of_pins", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":50, "inclusive":true})
     * @var int|null
     */
    public $num_of_pins;

    /**
     * Pin formats to get data for, default is all.
     * @DTA\Data(field="pin_format", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_format;

    /**
     * Get metrics for pins created in the last \&quot;n\&quot; days.
     * @DTA\Data(field="created_in_last_n_days", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $created_in_last_n_days;

    /**
     * Apps or devices to get data for, default is all.
     * @DTA\Data(field="app_types", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $app_types;

    /**
     * Filter on Pins that match your claimed domain.
     * @DTA\Data(field="from_claimed_content", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $from_claimed_content;

    /**
     * Specify sorting order for video metrics
     * @DTA\Data(field="sort_by")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $sort_by;

    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @DTA\Data(field="source", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $source;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @DTA\Data(field="start_date")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $start_date;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

}
