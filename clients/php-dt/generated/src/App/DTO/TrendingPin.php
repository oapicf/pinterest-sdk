<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin image data for trending topics
 */
class TrendingPin
{
    /**
     * Dominant color of the pin image in hex format
     * @DTA\Data(field="color")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $color = null;

    /**
     * Height of the pin image in pixels
     * @DTA\Data(field="height")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $height = null;

    /**
     * Unique identifier for the pin
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * URL of the pin image
     * @DTA\Data(field="src")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $src = null;

    /**
     * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
     * @DTA\Data(field="vertical_offset", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $vertical_offset = null;

    /**
     * Width of the pin image in pixels
     * @DTA\Data(field="width")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $width = null;

}
