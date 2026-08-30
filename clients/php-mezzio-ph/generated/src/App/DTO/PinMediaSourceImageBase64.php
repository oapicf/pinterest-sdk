<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Image Base64-based media source.
 */
class PinMediaSourceImageBase64
{
    /**
     * @DTA\Data(field="content_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContentType::class})
     * @var \App\DTO\ContentType|null
     */
    public $content_type;

    /**
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[a-zA-Z0-9+\/=]+$/"})
     * @var string|null
     */
    public $data;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_standard;

    /**
     * The source type of the media.
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $source_type;

}
