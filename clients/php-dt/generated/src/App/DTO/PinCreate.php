<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class PinCreate
{
    /**
     * AI disclosure declarations the creator has made about this Pin.
     * @DTA\Data(field="ai_disclosures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AiDisclosures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AiDisclosures::class})
     */
    public ?\App\DTO\AiDisclosures $ai_disclosures = null;

    /**
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":500})
     */
    public ?string $alt_text = null;

    /**
     * The board to which this Pin belongs.
     * @DTA\Data(field="board_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $board_id = null;

    /**
     * The board section to which this Pin belongs.
     * @DTA\Data(field="board_section_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $board_section_id = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":800})
     */
    public ?string $description = null;

    /**
     * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
     * @DTA\Data(field="dominant_color", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $dominant_color = null;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2048})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="media_source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinMediaSource::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinMediaSource::class})
     */
    public ?\App\DTO\PinMediaSource $media_source = null;

    /**
     * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
     * @DTA\Data(field="parent_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $parent_pin_id = null;

    /**
     * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
     * @DTA\Data(field="sponsor_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $sponsor_id = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $title = null;

}
