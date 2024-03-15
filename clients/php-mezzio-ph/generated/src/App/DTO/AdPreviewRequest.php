<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdPreviewRequest
{
    /**
     * Image URL.
     * @DTA\Data(field="image_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_url;

    /**
     * Title displayed below ad.
     * @DTA\Data(field="title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * Pin ID.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_id;

}
