<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad preview source from an image URL.
 */
class AdPreviewSourceImage
{
    /**
     * Image URL.
     * @DTA\Data(field="image_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_url;

    /**
     * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
     * @DTA\Data(field="promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $promotion_id;

    /**
     * Title displayed below ad.
     * @DTA\Data(field="title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

}
