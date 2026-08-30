<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin with image.
 */
class PinMediaWithImage
{
    /**
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageSize::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageSize::class})
     */
    public ?\App\DTO\ImageSize $images = null;

    /**
     * @DTA\Data(field="media_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_type = null;

}
