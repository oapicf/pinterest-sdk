<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin media source.
 */
class PinMediaSource
{
    /**
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $source_type;

    /**
     * @DTA\Data(field="content_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_type;

    /**
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/[a-zA-Z0-9+\/=]+/"})
     * @var string|null
     */
    public $data;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_standard;

    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * Cover image url.
     * @DTA\Data(field="cover_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_url;

    /**
     * Content type for cover image Base64.
     * @DTA\Data(field="cover_image_content_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_content_type;

    /**
     * Cover image Base64.
     * @DTA\Data(field="cover_image_data", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cover_image_data;

    /**
     * @DTA\Data(field="media_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $media_id;

    /**
     * Array with image objects.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\PinMediaSourceImagesURLItemsInner[]|null
     */
    public $items;

    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $index;

    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @DTA\Data(field="is_affiliate_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_affiliate_link;

}
