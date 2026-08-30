<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BoardMedia
{
    /**
     * Board cover image
     * @DTA\Data(field="image_cover_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_cover_url = null;

    /**
     * Board pin thumbnail urls.
     * @DTA\Data(field="pin_thumbnail_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $pin_thumbnail_urls = null;

}
