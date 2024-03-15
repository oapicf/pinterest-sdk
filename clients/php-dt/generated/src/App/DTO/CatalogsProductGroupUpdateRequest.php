<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object for updating a product group.
 */
class CatalogsProductGroupUpdateRequest
{
    /**
     * @DTA\Data(field="name", nullable=true)
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
     * @DTA\Data(field="filters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFiltersRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFiltersRequest::class})
     */
    public ?\App\DTO\CatalogsProductGroupFiltersRequest $filters = null;

}
