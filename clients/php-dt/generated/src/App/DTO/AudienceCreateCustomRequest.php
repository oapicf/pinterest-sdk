<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AudienceCreateCustomRequest
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
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="rule")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceRule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceRule::class})
     */
    public ?\App\DTO\AudienceRule $rule = null;

    /**
     * @DTA\Data(field="sharing_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceSharingType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceSharingType::class})
     */
    public ?\App\DTO\AudienceSharingType $sharing_type = null;

    /**
     * @DTA\Data(field="data_party")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceDataParty::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceDataParty::class})
     */
    public ?\App\DTO\AudienceDataParty $data_party = null;

    /**
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $category = null;

}
