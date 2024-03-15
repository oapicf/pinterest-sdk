<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * non-promoted catalog product group entity
 */
class CatalogProductGroup
{
    /**
     * ID of the catalog product group.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Merchant ID pertaining to the owner of the catalog product group.
     * @DTA\Data(field="merchant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $merchant_id;

    /**
     * Name of catalog product group
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Object holding a list of filters
     * @DTA\Data(field="filters", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $filters;

    /**
     * Object holding a list of filters
     * @DTA\Data(field="filter_v2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $filter_v2;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Board::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Board::class})
     * @var \App\DTO\Board|null
     */
    public $type;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * id of the feed profile belonging to this catalog product group
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $feed_profile_id;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @DTA\Data(field="last_update", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $last_update;

    /**
     * Amount of products in the catalog product group
     * @DTA\Data(field="product_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_count;

    /**
     * index of the featured position of the catalog product group
     * @DTA\Data(field="featured_position", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $featured_position;

}
