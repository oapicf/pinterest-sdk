<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for businessAssetsGet
 */
class BusinessAssetsGetQueryData
{
    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bookmark;

    /**
     * An asset group unique identifier. Used to fetch assets contained within the specified asset group.
     * @DTA\Data(field="asset_group_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":20})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $asset_group_id;

    /**
     * A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
     * @DTA\Data(field="child_asset_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":20})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $child_asset_id;

    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * @DTA\Data(field="start_index", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $start_index;

    /**
     * A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
     * @DTA\Data(field="permissions", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\PermissionsWithOwner::class and collection format multi inside query string
     * @var \App\DTO\PermissionsWithOwner[]|null
     */
    public $permissions;

    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @DTA\Data(field="asset_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $asset_type;

    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * @DTA\Data(field="page_size", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":250, "inclusive":true})
     * @var int|null
     */
    public $page_size;

}
