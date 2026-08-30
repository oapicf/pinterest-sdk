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
     */
    public ?string $catalog_type = null;

    /**
     * The catalog creative assets id in the merchant namespace
     * @DTA\Data(field="creative_assets_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $creative_assets_id = null;

    /**
     * Array with the errors for the item id requested
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $errors = null;

    /**
     * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     * @DTA\Data(field="item_response_kind")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_response_kind = null;

}
