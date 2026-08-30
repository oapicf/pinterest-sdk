<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ImageMetadata
{
    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageSize::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageSize::class})
     */
    public ?\App\DTO\ImageSize $images = null;

    /**
     * Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload.
     * @DTA\Data(field="item_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_type = null;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

}
