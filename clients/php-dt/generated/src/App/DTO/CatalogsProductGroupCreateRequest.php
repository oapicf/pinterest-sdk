<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object for creating a product group.
 */
class CatalogsProductGroupCreateRequest
{
    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * boolean indicator of whether the product group is being featured or not
     * @DTA\Data(field="is_featured", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_featured = null;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFiltersRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFiltersRequest::class})
     */
    public ?\App\DTO\CatalogsProductGroupFiltersRequest $filters = null;

    /**
     * Catalog Feed id pertaining to the catalog product group.
     * @DTA\Data(field="feed_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $feed_id = null;

}
