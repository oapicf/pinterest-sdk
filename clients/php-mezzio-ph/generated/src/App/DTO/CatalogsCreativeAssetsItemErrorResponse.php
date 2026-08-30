<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing a creative assets item error
 */
class CatalogsCreativeAssetsItemErrorResponse
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

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

    /**
     * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     * @DTA\Data(field="item_response_kind")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_response_kind;

}
