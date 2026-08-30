<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
class MediaUpload
{
    /**
     * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     * @DTA\Data(field="media_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $media_id;

    /**
     * @DTA\Data(field="media_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MediaUploadType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MediaUploadType::class})
     * @var \App\DTO\MediaUploadType|null
     */
    public $media_type;

    /**
     * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
     * @DTA\Data(field="upload_parameters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MediaUploadParameters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MediaUploadParameters::class})
     * @var \App\DTO\MediaUploadParameters|null
     */
    public $upload_parameters;

    /**
     * The URL where you will POST your media file.
     * @DTA\Data(field="upload_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $upload_url;

}
