<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for user_account/get
 */
class UserAccountGetQueryData
{
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
