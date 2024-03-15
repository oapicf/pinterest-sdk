<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ConversionEventResponse
{
    /**
     * @DTA\Data(field="conversion_event", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagType::class})
     */
    public ?\App\DTO\ConversionTagType $conversion_event = null;

    /**
     * Id of the tag.
     * @DTA\Data(field="conversion_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $conversion_tag_id = null;

    /**
     * Id of the ad account.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Creation date in epoch format.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

}
