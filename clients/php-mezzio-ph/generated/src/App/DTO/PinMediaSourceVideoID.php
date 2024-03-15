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
     * Cover image url.
     * @DTA\Data(field="cover_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_url;

    /**
     * Content type for cover image Base64.
     * @DTA\Data(field="cover_image_content_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_content_type;

    /**
     * Cover image Base64.
     * @DTA\Data(field="cover_image_data", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_data;

    /**
     * @DTA\Data(field="media_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $media_id;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_standard;

}
