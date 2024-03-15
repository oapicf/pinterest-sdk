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
     */
    public ?string $source_type = null;

    /**
     * @DTA\Data(field="content_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content_type = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/[a-zA-Z0-9+\/=]+/"})
     */
    public ?string $data = null;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_standard = null;

    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * Cover image url.
     * @DTA\Data(field="cover_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cover_image_url = null;

    /**
     * Content type for cover image Base64.
     * @DTA\Data(field="cover_image_content_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cover_image_content_type = null;

    /**
     * Cover image Base64.
     * @DTA\Data(field="cover_image_data", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cover_image_data = null;

    /**
     * @DTA\Data(field="media_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $media_id = null;

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

    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @DTA\Data(field="is_affiliate_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_affiliate_link = null;

}
