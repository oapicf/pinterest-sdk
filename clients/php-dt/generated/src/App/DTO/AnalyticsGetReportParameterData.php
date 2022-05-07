<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for analytics/get_report
 */
class AnalyticsGetReportParameterData
{
    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="path", field="ad_account_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Token returned from the post request creation call
     * @DTA\Data(subset="query", field="token")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $token;

}
