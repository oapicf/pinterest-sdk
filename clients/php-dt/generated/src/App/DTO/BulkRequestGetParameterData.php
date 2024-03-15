<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for bulk_request/get
 */
class BulkRequestGetParameterData
{
    /**
     * if set to True then attach the errors/details to all the requests
     * @DTA\Data(subset="query", field="include_details", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $include_details = null;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="path", field="ad_account_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"max":18})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Unique identifier of a bulk upsert request.
     * @DTA\Data(subset="path", field="bulk_request_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bulk_request_id = null;

}
