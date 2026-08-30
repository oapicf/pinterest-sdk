<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Video ID-based media source.
 */
class PinMediaSourceVideoID
{
    /**
     * Content type for cover image Base64.
     * @DTA\Data(field="cover_image_content_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContentType::class})
     */
    public ?\App\DTO\ContentType $cover_image_content_type = null;

    /**
     * Cover image Base64.
     * @DTA\Data(field="cover_image_data", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cover_image_data = null;

    /**
     * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
     * @DTA\Data(field="cover_image_key_frame_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $cover_image_key_frame_time = null;

    /**
     * Cover image URL.
     * @DTA\Data(field="cover_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cover_image_url = null;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_standard = null;

    /**
     * @DTA\Data(field="media_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $media_id = null;

    /**
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $source_type = null;

}
