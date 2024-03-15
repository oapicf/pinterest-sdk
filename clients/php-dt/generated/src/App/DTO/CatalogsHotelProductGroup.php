<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsHotelProductGroup
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * ID of the hotel product group.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Name of hotel product group
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
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelProductGroupFilters::class})
     */
    public ?\App\DTO\CatalogsHotelProductGroupFilters $filters = null;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @DTA\Data(field="updated_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_at = null;

    /**
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

}
