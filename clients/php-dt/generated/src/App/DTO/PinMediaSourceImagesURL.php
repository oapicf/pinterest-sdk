<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Multiple images urls-based media source
 */
class PinMediaSourceImagesURL
{
    /**
     * @DTA\Data(field="source_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $source_type = null;

    /**
     * Array with image objects.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $items = null;

    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $index = null;

}
