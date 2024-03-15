<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProductGroupPromotion
{
    /**
     * ID of the product group promotion.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

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
     * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
     * @DTA\Data(field="included", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $included = null;

    /**
     * The full product group definition path
     * @DTA\Data(field="definition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $definition = null;

    /**
     * The definition of the product group, relative to its parent - an attribute name/value pair
     * @DTA\Data(field="relative_definition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $relative_definition = null;

    /**
     * The parent Product Group ID of this Product Group
     * @DTA\Data(field="parent_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $parent_id = null;

    /**
     * Slideshow Collections Title
     * @DTA\Data(field="slideshow_collections_title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $slideshow_collections_title = null;

    /**
     * Slideshow Collections Description
     * @DTA\Data(field="slideshow_collections_description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $slideshow_collections_description = null;

    /**
     * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
     * @DTA\Data(field="is_mdl", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_mdl = null;

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

    /**
     * ID of the catalogs product group that this product group promotion references
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
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     */
    public ?\App\DTO\CreativeType $creative_type = null;

    /**
     * Hero Pin ID if this PG is promoted as a Collection
     * @DTA\Data(field="collections_hero_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $collections_hero_pin_id = null;

    /**
     * Collections Hero Destination Url
     * @DTA\Data(field="collections_hero_destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $collections_hero_destination_url = null;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     */
    public ?\App\DTO\GridClickType $grid_click_type = null;

}
