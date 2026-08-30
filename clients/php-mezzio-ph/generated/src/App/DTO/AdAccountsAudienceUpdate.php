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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
     * @DTA\Data(field="audience_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceType::class})
     * @var \App\DTO\AudienceType|null
     */
    public $audience_type;

    /**
     * Audience description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * Audience name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Audience operation type (update or remove). Only valid in update request body.
     * @DTA\Data(field="operation_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceUpdateOperationType::class})
     * @var \App\DTO\AudienceUpdateOperationType|null
     */
    public $operation_type;

    /**
     * @DTA\Data(field="rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdAccountsAudienceRule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdAccountsAudienceRule::class})
     * @var \App\DTO\AdAccountsAudienceRule|null
     */
    public $rule;

}
