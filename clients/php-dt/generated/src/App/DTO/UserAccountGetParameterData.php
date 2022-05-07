<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for user_account/get
 */
class UserAccountGetParameterData
{
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
