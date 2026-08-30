<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountToAdAccountSharedAudience
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection108::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection108::class})
     * @var \App\DTO\Collection108|null
     */
    public $permissions;

    /**
     * Ad account IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_account_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection109::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection109::class})
     * @var \App\DTO\Collection109|null
     */
    public $recipient_account_ids;

}
