<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model.
 */
class PinUpdate
{
    /**
     * AI disclosure declarations the creator has made about this Pin.
     * @DTA\Data(field="ai_disclosures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AiDisclosuresUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AiDisclosuresUpdate::class})
     */
    public ?\App\DTO\AiDisclosuresUpdate $ai_disclosures = null;

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
     * Carousel Pin slots data.
     * @DTA\Data(field="carousel_slots", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection448::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection448::class})
     */
    public ?\App\DTO\Collection448 $carousel_slots = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":800})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2048})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $title = null;

}
