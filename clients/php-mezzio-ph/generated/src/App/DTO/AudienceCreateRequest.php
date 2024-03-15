<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AudienceCreateRequest
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
     * Audience name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="rule")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceRule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceRule::class})
     * @var \App\DTO\AudienceRule|null
     */
    public $rule;

    /**
     * Audience description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * @DTA\Data(field="audience_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceCreateRequest1AudienceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceCreateRequest1AudienceType::class})
     * @var \App\DTO\AudienceCreateRequest1AudienceType|null
     */
    public $audience_type;

}
