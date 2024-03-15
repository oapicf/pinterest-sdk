<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Media upload details
 */
class MediaUploadDetails
{
    /**
     * @DTA\Data(field="media_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $media_id = null;

    /**
     * @DTA\Data(field="media_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MediaUploadType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MediaUploadType::class})
     */
    public ?\App\DTO\MediaUploadType $media_type = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MediaUploadStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MediaUploadStatus::class})
     */
    public ?\App\DTO\MediaUploadStatus $status = null;

}
