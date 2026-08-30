<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PinMediaSourceImagesBase64Item
{
    /**
     * @DTA\Data(field="content_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContentType::class})
     */
    public ?\App\DTO\ContentType $content_type = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[a-zA-Z0-9+\/=]+$/"})
     */
    public ?string $data = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

}
