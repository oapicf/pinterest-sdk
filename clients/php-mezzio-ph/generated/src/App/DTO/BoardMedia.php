<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Board media.
 */
class BoardMedia
{
    /**
     * Board cover image.
     * @DTA\Data(field="image_cover_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_cover_url;

    /**
     * Board pin thumbnail urls.
     * @DTA\Data(field="pin_thumbnail_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     * @var \App\DTO\Collection136|null
     */
    public $pin_thumbnail_urls;

}
