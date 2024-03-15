<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for ads/get
 */
class AdsGetParameterData
{
    /**
     * Unique identifier of an ad.
     * @DTA\Data(subset="path", field="ad_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"max":18})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_id = null;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="path", field="ad_account_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"max":18})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

}
