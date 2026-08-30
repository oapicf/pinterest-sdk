<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
class CustomerSegmentUpdateRequestUpdateWithRequiredBody
{
    /**
     * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
     * @DTA\Data(field="audience_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection196::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection196::class})
     * @var \App\DTO\Collection196|null
     */
    public $audience_ids;

    /**
     * Customer segment ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="operation_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @var \App\DTO\AudienceUpdateOperationType|null
     */
    public $operation_type;

}
