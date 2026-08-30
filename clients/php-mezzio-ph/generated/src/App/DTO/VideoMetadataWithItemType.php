<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VideoMetadataWithItemType
{
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
     * Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.
     * @DTA\Data(field="item_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_type;

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

}
