<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for analytics/get_mmm_report
 */
class AnalyticsGetMmmReportQueryData
{
    /**
     * Token returned from the post request creation call
     * @DTA\Data(field="token")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $token;

}
