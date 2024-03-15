<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin with multiple images.
 */
class PinMediaWithImages
{
    /**
     * @DTA\Data(field="media_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_type;

    /**
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ImageMetadata[]|null
     */
    public $items;

}
