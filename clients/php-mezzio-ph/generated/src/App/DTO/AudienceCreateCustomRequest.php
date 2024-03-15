<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AudienceCreateCustomRequest
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
     * @DTA\Data(field="sharing_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceSharingType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceSharingType::class})
     * @var \App\DTO\AudienceSharingType|null
     */
    public $sharing_type;

    /**
     * @DTA\Data(field="data_party")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceDataParty::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceDataParty::class})
     * @var \App\DTO\AudienceDataParty|null
     */
    public $data_party;

    /**
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $category;

}
