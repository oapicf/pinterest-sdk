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
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $alt_text;

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
     * @DTA\Strategy(name="Object", options={"type":BoardOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":BoardOwner::class})
     * @var BoardOwner|null
     */
    public $board_owner;

    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":PinMedia::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":PinMedia::class})
     * @var PinMedia|null
     */
    public $media;

    /**
     * @DTA\Data(field="media_source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":PinMediaSource::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":PinMediaSource::class})
     * @var PinMediaSource|null
     */
    public $media_source;

}
