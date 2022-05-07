<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Video ID-based media source
 */
class PinMediaSourceVideoID
{
    /**
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $source_type;

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
