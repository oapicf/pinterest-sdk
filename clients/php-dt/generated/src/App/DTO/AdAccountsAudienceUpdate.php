<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model.
 */
class AdAccountsAudienceUpdate
{
    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
     * @DTA\Data(field="audience_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceType::class})
     */
    public ?\App\DTO\AudienceType $audience_type = null;

    /**
     * Audience description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Audience name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Audience operation type (update or remove). Only valid in update request body.
     * @DTA\Data(field="operation_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     */
    public ?\App\DTO\AudienceUpdateOperationType $operation_type = null;

    /**
     * @DTA\Data(field="rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdAccountsAudienceRule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdAccountsAudienceRule::class})
     */
    public ?\App\DTO\AdAccountsAudienceRule $rule = null;

}
