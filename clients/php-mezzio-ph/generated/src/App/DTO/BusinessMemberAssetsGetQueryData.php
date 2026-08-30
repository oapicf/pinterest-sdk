<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for businessMemberAssetsGet
 */
class BusinessMemberAssetsGetQueryData
{
    /**
     * The value to search for
     * @DTA\Data(field="search_value", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $search_value;

    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bookmark;

    /**
     * The field to search member assets by
     * @DTA\Data(field="search_by", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $search_by;

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
     * Sort assets in ascending order
     * @DTA\Data(field="sort_ascending", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $sort_ascending;

    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @DTA\Data(field="asset_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $asset_type;

    /**
     * A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
     * @DTA\Data(field="ad_account_statuses", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\NonDraftEntityStatus::class and collection format multi inside query string
     * @var \App\DTO\NonDraftEntityStatus[]|null
     */
    public $ad_account_statuses;

    /**
     * The field to sort member assets by
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $sort_by;

    /**
     * The type of asset permission to filter by
     * @DTA\Data(field="asset_permission_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $asset_permission_type;

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
