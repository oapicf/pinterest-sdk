<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsProductGroupsCreate201Response
{
    /**
     * ID of the catalog product group.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Name of catalog product group
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilters $filters = null;

    /**
     * boolean indicator of whether the product group is being featured or not
     * @DTA\Data(field="is_featured", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_featured = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupType::class})
     */
    public ?\App\DTO\CatalogsProductGroupType $type = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupStatus::class})
     */
    public ?\App\DTO\CatalogsProductGroupStatus $status = null;

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
     * @DTA\Data(field="feed_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $feed_id = null;

    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

}
