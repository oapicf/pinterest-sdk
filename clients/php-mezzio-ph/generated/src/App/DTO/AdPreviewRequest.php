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

    /**
     * Ad format of the shopping ad preview.
     * @DTA\Data(field="creative_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdShoppingPreviewCreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdShoppingPreviewCreativeType::class})
     * @var \App\DTO\AdShoppingPreviewCreativeType|null
     */
    public $creative_type;

    /**
     * Pin ID.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_id;

    /**
     * Catalog Product Group Id.
     * @DTA\Data(field="catalog_product_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_product_group_id;

    /**
     * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;
     * @DTA\Data(field="customizable_cta_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CustomizableCTAType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CustomizableCTAType::class})
     * @var \App\DTO\CustomizableCTAType|null
     */
    public $customizable_cta_type;

    /**
     * Title displayed below ad.
     * @DTA\Data(field="hero_image_title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $hero_image_title;

    /**
     * Hero image URL.
     * @DTA\Data(field="hero_image_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $hero_image_url;

    /**
     * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
     * @DTA\Data(field="hero_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $hero_pin_id;

    /**
     * Multi image template tag.
     * @DTA\Data(field="image_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_tag;

    /**
     * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * Preferred media type.
     * @DTA\Data(field="preferred_media_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BasePreferredMediaType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BasePreferredMediaType::class})
     * @var \App\DTO\BasePreferredMediaType|null
     */
    public $preferred_media_type;

    /**
     * Include promotion data in preview when available on catalog item. Defaults to false.
     * @DTA\Data(field="show_promotion", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $show_promotion;

    /**
     * Multi video template tag, image_tag and video_tag are mutual exclusive.
     * @DTA\Data(field="video_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $video_tag;

}
