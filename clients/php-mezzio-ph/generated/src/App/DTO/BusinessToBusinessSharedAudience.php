<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BusinessToBusinessSharedAudience
{
    /**
     * Unique identifier of an audience
     * @DTA\Data(field="audience_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $audience_id;

    /**
     * Permissions granted to the recipients.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection365::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection365::class})
     * @var \App\DTO\Collection365|null
     */
    public $permissions;

    /**
     * Business IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_business_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection366::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection366::class})
     * @var \App\DTO\Collection366|null
     */
    public $recipient_business_ids;

}
