<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountToBusinessSharedAudience
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection111::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection111::class})
     * @var \App\DTO\Collection111|null
     */
    public $permissions;

    /**
     * Business IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_business_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection112::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection112::class})
     * @var \App\DTO\Collection112|null
     */
    public $recipient_business_ids;

}
