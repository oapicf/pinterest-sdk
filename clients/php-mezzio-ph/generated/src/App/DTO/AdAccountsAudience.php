<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountsAudience
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
     * The company that created this audience.
     * @DTA\Data(field="created_by_company_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $created_by_company_name;

    /**
     * Creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_timestamp;

    /**
     * Audience description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * Audience ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
     * @DTA\Data(field="is_nca", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_nca;

    /**
     * Audience name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="rule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdAccountsAudienceRule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdAccountsAudienceRule::class})
     * @var \App\DTO\AdAccountsAudienceRule|null
     */
    public $rule;

    /**
     * Audience size.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size;

    /**
     * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceStatus::class})
     * @var \App\DTO\AudienceStatus|null
     */
    public $status;

    /**
     * Always \&quot;audience\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_timestamp;

}
