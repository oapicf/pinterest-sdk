<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for pins/analytics
 */
class PinsAnalyticsParameterData
{
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(subset="query", field="end_date")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $end_date;

    /**
     * Pin metric types to get data for, default is all.
     * @DTA\Data(subset="query", field="metric_types")
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $metric_types;

    /**
     * How to split the data into groups. Not including this param means data won&#39;t be split.
     * @DTA\Data(subset="query", field="split_field", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $split_field;

    /**
     * Apps or devices to get data for, default is all.
     * @DTA\Data(subset="query", field="app_types", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $app_types;

    /**
     * Unique identifier of a Pin.
     * @DTA\Data(subset="path", field="pin_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_id;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(subset="query", field="start_date")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $start_date;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="query", field="ad_account_id", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

}
