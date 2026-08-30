<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for businessMemberAssetsGet
 */
class BusinessMemberAssetsGetParameterData
{
    /**
     * The member id to fetch assets for.
     * @DTA\Data(subset="path", field="member_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"min":1, "max":20})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $member_id = null;

    /**
     * The value to search for
     * @DTA\Data(subset="query", field="search_value", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $search_value = null;

    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(subset="query", field="bookmark", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * The field to search member assets by
     * @DTA\Data(subset="query", field="search_by", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $search_by = null;

    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * @DTA\Data(subset="query", field="start_index", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":0})
     */
    public ?int $start_index = null;

    /**
     * Sort assets in ascending order
     * @DTA\Data(subset="query", field="sort_ascending", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $sort_ascending = null;

    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @DTA\Data(subset="query", field="asset_type", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $asset_type = null;

    /**
     * A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
     * @DTA\Data(subset="query", field="ad_account_statuses", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\NonDraftEntityStatus::class and collection format multi inside query string
     */
    public ?array $ad_account_statuses = null;

    /**
     * The field to sort member assets by
     * @DTA\Data(subset="query", field="sort_by", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $sort_by = null;

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
     * The type of asset permission to filter by
     * @DTA\Data(subset="query", field="asset_permission_type", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $asset_permission_type = null;

    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * @DTA\Data(subset="query", field="page_size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":1, "max":250})
     */
    public ?int $page_size = null;

}
