<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
class BusinessToBusinessSharedAudienceUpdateWithRequiredBody
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
     * Business IDs to share with or revoke from (request) / that received the audience (response).
     * @DTA\Data(field="recipient_business_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection364::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection364::class})
     * @var \App\DTO\Collection364|null
     */
    public $recipient_business_ids;

}
