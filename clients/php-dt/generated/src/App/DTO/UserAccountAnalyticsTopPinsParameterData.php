<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for user_account/analytics/top_pins
 */
class UserAccountAnalyticsTopPinsParameterData
{
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @DTA\Data(subset="query", field="end_date")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $end_date = null;

    /**
     * Metric types to get data for, default is all.
     * @DTA\Data(subset="query", field="metric_types", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $metric_types = null;

    /**
     * Filter to paid or organic data. Default is all.
     * @DTA\Data(subset="query", field="content_type", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $content_type = null;

    /**
     * Number of pins to include, default is 10. Max is 50.
     * @DTA\Data(subset="query", field="num_of_pins", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":1, "max":50})
     */
    public ?int $num_of_pins = null;

    /**
     * Pin formats to get data for, default is all.
     * @DTA\Data(subset="query", field="pin_format", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $pin_format = null;

    /**
     * Get metrics for pins created in the last \&quot;n\&quot; days.
     * @DTA\Data(subset="query", field="created_in_last_n_days", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $created_in_last_n_days = null;

    /**
     * Apps or devices to get data for, default is all.
     * @DTA\Data(subset="query", field="app_types", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $app_types = null;

    /**
     * Filter on Pins that match your claimed domain.
     * @DTA\Data(subset="query", field="from_claimed_content", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $from_claimed_content = null;

    /**
     * Specify sorting order for metrics
     * @DTA\Data(subset="query", field="sort_by")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $sort_by = null;

    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @DTA\Data(subset="query", field="source", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $source = null;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @DTA\Data(subset="query", field="start_date")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $start_date = null;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="query", field="ad_account_id", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Length", options={"max":18})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

}
