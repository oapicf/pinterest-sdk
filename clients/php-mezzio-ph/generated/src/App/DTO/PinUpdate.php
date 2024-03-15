<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin fields for updates
 */
class PinUpdate
{
    /**
     * Pin&#39;s alternative text.
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":500})
     * @var string|null
     */
    public $alt_text;

    /**
     * The id of the board to move the Pin onto.
     * @DTA\Data(field="board_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $board_id;

    /**
     * &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.
     * @DTA\Data(field="board_section_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $board_section_id;

    /**
     * Pin description - 800 characters maximum.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":800})
     * @var string|null
     */
    public $description;

    /**
     * URL viewer is taken to when they click pin.
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2048})
     * @var string|null
     */
    public $link;

    /**
     * The native pin title that creators explicitly prefer to display.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $title;

    /**
     * Carousel Pin slots data.
     * @DTA\Data(field="carousel_slots", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection145::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection145::class})
     * @var \App\DTO\Collection145|null
     */
    public $carousel_slots;

    /**
     * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
     * @DTA\Data(field="note", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $note;

}
