<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
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
     * @DTA\Data(field="operation_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OperationType::class})
     * @var \App\DTO\OperationType|null
     */
    public $operation_type;

    /**
     * Ad account IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_account_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection361::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection361::class})
     * @var \App\DTO\Collection361|null
     */
    public $recipient_account_ids;

}
