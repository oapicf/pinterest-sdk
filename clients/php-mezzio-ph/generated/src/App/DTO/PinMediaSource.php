<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin media source.
 */
class PinMediaSource
{
    /**
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $source_type;

    /**
     * @DTA\Data(field="content_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_type;

    /**
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/[a-zA-Z0-9+\/=]+/"})
     * @var string|null
     */
    public $data;

    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * @DTA\Data(field="cover_image_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_url;

    /**
     * @DTA\Data(field="media_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $media_id;

}
