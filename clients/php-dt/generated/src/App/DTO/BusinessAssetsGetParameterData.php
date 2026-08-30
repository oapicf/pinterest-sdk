<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for businessAssetsGet
 */
class BusinessAssetsGetParameterData
{
    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(subset="query", field="bookmark", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * An asset group unique identifier. Used to fetch assets contained within the specified asset group.
     * @DTA\Data(subset="query", field="asset_group_id", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Length", options={"min":1, "max":20})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $asset_group_id = null;

    /**
     * A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
     * @DTA\Data(subset="query", field="child_asset_id", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Length", options={"min":1, "max":20})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $child_asset_id = null;

    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * @DTA\Data(subset="query", field="start_index", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":0})
     */
    public ?int $start_index = null;

    /**
     * A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
     * @DTA\Data(subset="query", field="permissions", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\PermissionsWithOwner::class and collection format multi inside query string
     */
    public ?array $permissions = null;

    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @DTA\Data(subset="query", field="asset_type", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $asset_type = null;

    /**
     * Unique identifier of the requesting business.
     * @DTA\Data(subset="path", field="business_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"min":1, "max":20})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $business_id = null;

    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * @DTA\Data(subset="query", field="page_size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":1, "max":250})
     */
    public ?int $page_size = null;

}
