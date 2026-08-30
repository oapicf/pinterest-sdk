<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsCreativeAssetsAttributes
{
    /**
     * Link to the creative assets page.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $android_deep_link = null;

    /**
     * Custom grouping of creative assets.
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_0 = null;

    /**
     * Custom grouping of creative assets.
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_1 = null;

    /**
     * Custom grouping of creative assets.
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_2 = null;

    /**
     * Custom grouping of creative assets.
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_3 = null;

    /**
     * Custom grouping of creative assets.
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_4 = null;

    /**
     * Brief description of the creative assets.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @DTA\Data(field="google_product_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $google_product_category = null;

    /**
     * IOS deep link to the creative assets page.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ios_deep_link = null;

    /**
     * Link to the creative assets page.
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * The name of the creative assets.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.
     * @DTA\Data(field="visibility", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $visibility = null;

    /**
     * AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL.
     * @DTA\Data(field="ai_disclosures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $ai_disclosures = null;

    /**
     * The creative assets image.
     * @DTA\Data(field="image_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_link = null;

    /**
     * The creative assets video.
     * @DTA\Data(field="video_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $video_link = null;

}
