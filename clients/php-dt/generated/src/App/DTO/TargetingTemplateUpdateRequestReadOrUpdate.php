<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TargetingTemplateUpdateRequestReadOrUpdate
{
    /**
     * Targeting template ID
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="operation_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     */
    public ?\App\DTO\AudienceUpdateOperationType $operation_type = null;

    /**
     * targeting profile attributes
     * @DTA\Data(field="targeting_attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     */
    public ?\App\DTO\TargetingSpecOptimal $targeting_attributes = null;

}
