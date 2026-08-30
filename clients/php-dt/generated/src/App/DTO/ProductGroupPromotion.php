<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductGroupPromotion
{
    /**
     * ID of the ad group the product group belongs to.
     * @DTA\Data(field="ad_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * The bid in micro currency.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bid_in_micro_currency = null;

    /**
     * ID of the catalogs product group that this product group promotion references (required for create operations)
     * @DTA\Data(field="catalog_product_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_product_group_id = null;

    /**
     * Catalogs product group name
     * @DTA\Data(field="catalog_product_group_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_product_group_name = null;

    /**
     * @DTA\Data(field="collections_header_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CollectionsHeaderType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CollectionsHeaderType::class})
     */
    public ?\App\DTO\CollectionsHeaderType $collections_header_type = null;

    /**
     * Collections Hero Destination Url
     * @DTA\Data(field="collections_hero_destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $collections_hero_destination_url = null;

    /**
     * Hero Pin ID if this PG is promoted as a Collection
     * @DTA\Data(field="collections_hero_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $collections_hero_pin_id = null;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     */
    public ?\App\DTO\CreativeType $creative_type = null;

    /**
     * @DTA\Data(field="customizable_cta_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductGroupPromotionCustomizableCTAType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductGroupPromotionCustomizableCTAType::class})
     */
    public ?\App\DTO\ProductGroupPromotionCustomizableCTAType $customizable_cta_type = null;

    /**
     * The full product group definition path
     * @DTA\Data(field="definition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $definition = null;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     */
    public ?\App\DTO\GridClickType $grid_click_type = null;

    /**
     * ID of the product group promotion (required for update operations).
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
     * @DTA\Data(field="included", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $included = null;

    /**
     * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
     * @DTA\Data(field="is_generate_background", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_generate_background = null;

    /**
     * Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
     * @DTA\Data(field="is_image_auto_resizing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_image_auto_resizing = null;

    /**
     * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
     * @DTA\Data(field="is_mdl", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_mdl = null;

    /**
     * The parent Product Group ID of this Product Group
     * @DTA\Data(field="parent_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $parent_id = null;

    /**
     * @DTA\Data(field="preferred_media_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PreferredMediaType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PreferredMediaType::class})
     */
    public ?\App\DTO\PreferredMediaType $preferred_media_type = null;

    /**
     * The definition of the product group, relative to its parent - an attribute name/value pair
     * @DTA\Data(field="relative_definition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $relative_definition = null;

    /**
     * The ad image tag selected for the product group promotion.
     * @DTA\Data(field="selected_image_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $selected_image_tag = null;

    /**
     * The ad video tag selected for the product group promotion.
     * @DTA\Data(field="selected_video_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $selected_video_tag = null;

    /**
     * Slideshow Collections Description
     * @DTA\Data(field="slideshow_collections_description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $slideshow_collections_description = null;

    /**
     * Slideshow Collections Title
     * @DTA\Data(field="slideshow_collections_title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $slideshow_collections_title = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * Tracking template for proudct group promotions. 4000 limit
     * @DTA\Data(field="tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $tracking_url = null;

}
