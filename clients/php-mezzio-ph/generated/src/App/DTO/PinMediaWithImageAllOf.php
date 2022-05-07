<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PinMediaWithImageAllOf
{
    /**
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var array&lt;string,\App\DTO\ImageDetails&gt;|null
     */
    public $images;

}
