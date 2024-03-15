<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin
 */
class Pin
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2048})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.
     * @DTA\Data(field="dominant_color", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $dominant_color = null;

    /**
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":500})
     */
    public ?string $alt_text = null;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     */
    public ?\App\DTO\CreativeType $creative_type = null;

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
     * @DTA\Data(field="board_owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BoardOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BoardOwner::class})
     */
    public ?\App\DTO\BoardOwner $board_owner = null;

    /**
     * Whether the \&quot;operation user_account\&quot; is the Pin owner.
     * @DTA\Data(field="is_owner", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_owner = null;

    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SummaryPinMedia::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SummaryPinMedia::class})
     */
    public ?\App\DTO\SummaryPinMedia $media = null;

    /**
     * @DTA\Data(field="media_source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinMediaSource::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinMediaSource::class})
     */
    public ?\App\DTO\PinMediaSource $media_source = null;

    /**
     * The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.
     * @DTA\Data(field="parent_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $parent_pin_id = null;

    /**
     * Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_standard = null;

    /**
     * Whether the Pin has been promoted or not.
     * @DTA\Data(field="has_been_promoted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_been_promoted = null;

    /**
     * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
     * @DTA\Data(field="note", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $note = null;

    /**
     * Pin metrics with associated time intervals if any.
     * @DTA\Data(field="pin_metrics", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $pin_metrics = null;

}
