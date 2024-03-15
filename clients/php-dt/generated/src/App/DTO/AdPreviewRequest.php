<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdPreviewRequest
{
    /**
     * Image URL.
     * @DTA\Data(field="image_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_url = null;

    /**
     * Title displayed below ad.
     * @DTA\Data(field="title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * Pin ID.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pin_id = null;

}
