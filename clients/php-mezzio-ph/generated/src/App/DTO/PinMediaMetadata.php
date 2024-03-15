<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PinMediaMetadata
{
    /**
     * @DTA\Data(field="item_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_type;

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
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $link;

    /**
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageMetadataImages::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageMetadataImages::class})
     * @var \App\DTO\ImageMetadataImages|null
     */
    public $images;

    /**
     * @DTA\Data(field="cover_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_url;

    /**
     * Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
     * @DTA\Data(field="video_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $video_url;

    /**
     * Duration (in milliseconds)
     * @DTA\Data(field="duration", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $duration;

    /**
     * Height (in pixels)
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $height;

    /**
     * Width (in pixels)
     * @DTA\Data(field="width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $width;

}
