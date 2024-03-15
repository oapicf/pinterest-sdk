<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ImageMetadata
{
    /**
     * @DTA\Data(field="item_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_type = null;

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
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageMetadataImages::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageMetadataImages::class})
     */
    public ?\App\DTO\ImageMetadataImages $images = null;

}
