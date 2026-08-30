<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
 */
class ItemResponse
{
    /**
     * @DTA\Data(field="attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsCreativeAssetsAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsCreativeAssetsAttributes::class})
     * @var \App\DTO\CatalogsCreativeAssetsAttributes|null
     */
    public $attributes;

    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     * @DTA\Data(field="item_response_kind")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_response_kind;

    /**
     * The pins mapped to the item
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\Pin[]|null
     */
    public $pins;

    /**
     * The catalog hotel id in the merchant namespace
     * @DTA\Data(field="hotel_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $hotel_id;

    /**
     * The catalog creative assets id in the merchant namespace
     * @DTA\Data(field="creative_assets_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $creative_assets_id;

    /**
     * Array with the errors for the item id requested
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ItemValidationEvent[]|null
     */
    public $errors;

}
