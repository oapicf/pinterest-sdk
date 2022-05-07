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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $media_id;

    /**
     * @DTA\Data(field="media_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":MediaUploadType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":MediaUploadType::class})
     * @var MediaUploadType|null
     */
    public $media_type;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":MediaUploadStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":MediaUploadStatus::class})
     * @var MediaUploadStatus|null
     */
    public $status;

}
