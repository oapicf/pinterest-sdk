<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for pins/analytics
 */
class PinsAnalyticsQueryData
{
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $end_date;

    /**
     * Pin metric types to get data for, default is all.
     * @DTA\Data(field="metric_types")
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $metric_types;

    /**
     * How to split the data into groups. Not including this param means data won&#39;t be split.
     * @DTA\Data(field="split_field", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $split_field;

    /**
     * Apps or devices to get data for, default is all.
     * @DTA\Data(field="app_types", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $app_types;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

}
