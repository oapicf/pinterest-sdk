<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ImageDetails
{
    /**
     * @DTA\Data(field="width")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":100, "inclusive":true})
     * @var int|null
     */
    public $width;

    /**
     * @DTA\Data(field="height")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":100, "inclusive":true})
     * @var int|null
     */
    public $height;

    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

}
