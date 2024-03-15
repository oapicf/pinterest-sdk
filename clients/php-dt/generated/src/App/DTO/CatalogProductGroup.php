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
     */
    public ?string $id = null;

    /**
     * Merchant ID pertaining to the owner of the catalog product group.
     * @DTA\Data(field="merchant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $merchant_id = null;

    /**
     * Name of catalog product group
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Object holding a list of filters
     * @DTA\Data(field="filters", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $filters = null;

    /**
     * Object holding a list of filters
     * @DTA\Data(field="filter_v2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $filter_v2 = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Board::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Board::class})
     */
    public ?\App\DTO\Board $type = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * id of the feed profile belonging to this catalog product group
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $feed_profile_id = null;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @DTA\Data(field="last_update", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $last_update = null;

    /**
     * Amount of products in the catalog product group
     * @DTA\Data(field="product_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $product_count = null;

    /**
     * index of the featured position of the catalog product group
     * @DTA\Data(field="featured_position", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $featured_position = null;

}
