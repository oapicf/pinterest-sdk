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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_at;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2048})
     * @var string|null
     */
    public $link;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.
     * @DTA\Data(field="dominant_color", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $dominant_color;

    /**
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":500})
     * @var string|null
     */
    public $alt_text;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     * @var \App\DTO\CreativeType|null
     */
    public $creative_type;

    /**
     * The board to which this Pin belongs.
     * @DTA\Data(field="board_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $board_id;

    /**
     * The board section to which this Pin belongs.
     * @DTA\Data(field="board_section_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $board_section_id;

    /**
     * @DTA\Data(field="board_owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BoardOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BoardOwner::class})
     * @var \App\DTO\BoardOwner|null
     */
    public $board_owner;

    /**
     * Whether the \&quot;operation user_account\&quot; is the Pin owner.
     * @DTA\Data(field="is_owner", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_owner;

    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SummaryPinMedia::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SummaryPinMedia::class})
     * @var \App\DTO\SummaryPinMedia|null
     */
    public $media;

    /**
     * @DTA\Data(field="media_source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinMediaSource::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinMediaSource::class})
     * @var \App\DTO\PinMediaSource|null
     */
    public $media_source;

    /**
     * The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.
     * @DTA\Data(field="parent_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $parent_pin_id;

    /**
     * Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_standard;

    /**
     * Whether the Pin has been promoted or not.
     * @DTA\Data(field="has_been_promoted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_been_promoted;

    /**
     * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
     * @DTA\Data(field="note", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $note;

    /**
     * Pin metrics with associated time intervals if any.
     * @DTA\Data(field="pin_metrics", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $pin_metrics;

}
