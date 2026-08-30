<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
{
    /**
     * Unique identifier of an audience
     * @DTA\Data(field="audience_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $audience_id = null;

    /**
     * @DTA\Data(field="operation_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OperationType::class})
     */
    public ?\App\DTO\OperationType $operation_type = null;

    /**
     * Business IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_business_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection110::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection110::class})
     */
    public ?\App\DTO\Collection110 $recipient_business_ids = null;

}
