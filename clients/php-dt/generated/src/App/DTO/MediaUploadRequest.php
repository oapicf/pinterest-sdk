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
     * @DTA\Strategy(name="Object", options={"type":MediaUploadType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":MediaUploadType::class})
     * @var MediaUploadType|null
     */
    public $media_type;

}
