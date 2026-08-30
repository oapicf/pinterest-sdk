<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PinMediaSourceImagesBase64Item
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
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $link;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

}
