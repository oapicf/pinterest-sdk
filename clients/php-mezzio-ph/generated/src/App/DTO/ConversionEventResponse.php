<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionEventResponse
{
    /**
     * @DTA\Data(field="conversion_event", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagType::class})
     * @var \App\DTO\ConversionTagType|null
     */
    public $conversion_event;

    /**
     * Id of the tag.
     * @DTA\Data(field="conversion_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $conversion_tag_id;

    /**
     * Id of the ad account.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Creation date in epoch format.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

}
