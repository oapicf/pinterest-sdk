<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * catalog product group entity
 */
class CatalogsProductGroup
{
    /**
     * ID of the catalog product group.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Name of catalog product group
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * @DTA\Data(field="filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilters::class})
     * @var \App\DTO\CatalogsProductGroupFilters|null
     */
    public $filters;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupType::class})
     * @var \App\DTO\CatalogsProductGroupType|null
     */
    public $type;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupStatus::class})
     * @var \App\DTO\CatalogsProductGroupStatus|null
     */
    public $status;

    /**
     * id of the catalogs feed belonging to this catalog product group
     * @DTA\Data(field="feed_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $feed_id;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @DTA\Data(field="updated_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_at;

}
