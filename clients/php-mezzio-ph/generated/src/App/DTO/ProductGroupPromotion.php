<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProductGroupPromotion
{
    /**
     * ID of the product group promotion.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * ID of the ad group the product group belongs to.
     * @DTA\Data(field="ad_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * The bid in micro currency.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bid_in_micro_currency;

    /**
     * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
     * @DTA\Data(field="included", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $included;

    /**
     * The full product group definition path
     * @DTA\Data(field="definition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $definition;

    /**
     * The definition of the product group, relative to its parent - an attribute name/value pair
     * @DTA\Data(field="relative_definition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $relative_definition;

    /**
     * The parent Product Group ID of this Product Group
     * @DTA\Data(field="parent_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $parent_id;

    /**
     * Slideshow Collections Title
     * @DTA\Data(field="slideshow_collections_title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $slideshow_collections_title;

    /**
     * Slideshow Collections Description
     * @DTA\Data(field="slideshow_collections_description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $slideshow_collections_description;

    /**
     * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
     * @DTA\Data(field="is_mdl", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_mdl;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * Tracking template for proudct group promotions. 4000 limit
     * @DTA\Data(field="tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $tracking_url;

    /**
     * ID of the catalogs product group that this product group promotion references
     * @DTA\Data(field="catalog_product_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_product_group_id;

    /**
     * Catalogs product group name
     * @DTA\Data(field="catalog_product_group_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_product_group_name;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     * @var \App\DTO\CreativeType|null
     */
    public $creative_type;

    /**
     * Hero Pin ID if this PG is promoted as a Collection
     * @DTA\Data(field="collections_hero_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $collections_hero_pin_id;

    /**
     * Collections Hero Destination Url
     * @DTA\Data(field="collections_hero_destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $collections_hero_destination_url;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     * @var \App\DTO\GridClickType|null
     */
    public $grid_click_type;

}
