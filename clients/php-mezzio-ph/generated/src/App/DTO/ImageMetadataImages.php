<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ImageMetadataImages
{
    /**
     * @DTA\Data(field="150x150", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     * @var \App\DTO\ImageDetails|null
     */
    public $_150x150;

    /**
     * @DTA\Data(field="400x300", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     * @var \App\DTO\ImageDetails|null
     */
    public $_400x300;

    /**
     * @DTA\Data(field="600x", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     * @var \App\DTO\ImageDetails|null
     */
    public $_600x;

    /**
     * @DTA\Data(field="1200x", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     * @var \App\DTO\ImageDetails|null
     */
    public $_1200x;

}
