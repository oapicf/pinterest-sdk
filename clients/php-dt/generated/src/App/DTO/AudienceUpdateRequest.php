<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AudienceUpdateRequest
{
    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Audience name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceRule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceRule::class})
     */
    public ?\App\DTO\AudienceRule $rule = null;

    /**
     * Audience description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="operation_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     */
    public ?\App\DTO\AudienceUpdateOperationType $operation_type = null;

}
