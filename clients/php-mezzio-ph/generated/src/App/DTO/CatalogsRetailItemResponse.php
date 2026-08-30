<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing a retail item record
 */
class CatalogsRetailItemResponse
{
    /**
     * @DTA\Data(field="attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAttributes::class})
     * @var \App\DTO\ItemAttributes|null
     */
    public $attributes;

    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * The catalog retail item id in the merchant namespace
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

}
