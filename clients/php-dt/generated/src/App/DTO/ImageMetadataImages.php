<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ImageMetadataImages
{
    /**
     * @DTA\Data(field="150x150", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     */
    public ?\App\DTO\ImageDetails $_150x150 = null;

    /**
     * @DTA\Data(field="400x300", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     */
    public ?\App\DTO\ImageDetails $_400x300 = null;

    /**
     * @DTA\Data(field="600x", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     */
    public ?\App\DTO\ImageDetails $_600x = null;

    /**
     * @DTA\Data(field="1200x", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageDetails::class})
     */
    public ?\App\DTO\ImageDetails $_1200x = null;

}
