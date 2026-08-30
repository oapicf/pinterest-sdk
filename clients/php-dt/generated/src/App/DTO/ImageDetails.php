<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ImageDetails
{
    /**
     * @DTA\Data(field="height")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $height = null;

    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * @DTA\Data(field="width")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $width = null;

}
