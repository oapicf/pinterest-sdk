<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Board
 */
class Board
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Date and time of board creation.
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * Date and time of last board pins modified.
     * @DTA\Data(field="board_pins_modified_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $board_pins_modified_at = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Count of collaborators on the board.
     * @DTA\Data(field="collaborator_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $collaborator_count = null;

    /**
     * Count of pins on the board.
     * @DTA\Data(field="pin_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $pin_count = null;

    /**
     * Board follower count.
     * @DTA\Data(field="follower_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $follower_count = null;

    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BoardMedia::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BoardMedia::class})
     */
    public ?\App\DTO\BoardMedia $media = null;

    /**
     * @DTA\Data(field="owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BoardOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BoardOwner::class})
     */
    public ?\App\DTO\BoardOwner $owner = null;

    /**
     * Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
     * @DTA\Data(field="privacy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $privacy = null;

}
