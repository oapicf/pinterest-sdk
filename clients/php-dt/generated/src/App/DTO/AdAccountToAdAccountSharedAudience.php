<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountToAdAccountSharedAudience
{
    /**
     * Unique identifier of an audience
     * @DTA\Data(field="audience_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $audience_id = null;

    /**
     * Permissions granted to the recipients.
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection108::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection108::class})
     */
    public ?\App\DTO\Collection108 $permissions = null;

    /**
     * Ad account IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_account_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection109::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection109::class})
     */
    public ?\App\DTO\Collection109 $recipient_account_ids = null;

}
