<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for items_batch/post
 */
class ItemsBatchPostParameterData
{
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
