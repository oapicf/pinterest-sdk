<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Media upload request
 */
class MediaUploadRequest
{
    /**
     * @DTA\Data(field="media_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MediaUploadType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MediaUploadType::class})
     * @var \App\DTO\MediaUploadType|null
     */
    public $media_type;

}
