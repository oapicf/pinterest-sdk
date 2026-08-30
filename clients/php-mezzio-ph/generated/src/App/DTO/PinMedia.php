<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin media that can be an image, video, or a mix of both.
 */
class PinMedia
{
    /**
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageSize::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageSize::class})
     * @var \App\DTO\ImageSize|null
     */
    public $images;

    /**
     * @DTA\Data(field="media_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_type;

    /**
     * @DTA\Data(field="cover_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_url;

    /**
     * Duration (in miliseconds). Field maybe null after creation due to video processing time.
     * @DTA\Data(field="duration", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $duration;

    /**
     * Height (in pixels). Field maybe null after creation due to video processing time.
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $height;

    /**
     * Video url (720p).  **Note:** This field is limited and not available to all apps.
     * @DTA\Data(field="video_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $video_url;

    /**
     * Video url (HLS).  **Note:** This field is limited and not available to all apps.
     * @DTA\Data(field="video_url_hls", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $video_url_hls;

    /**
     * Width (in pixels). Field maybe null after creation due to video processing time.
     * @DTA\Data(field="width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $width;

    /**
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\PinMediaMetadata[]|null
     */
    public $items;

}
