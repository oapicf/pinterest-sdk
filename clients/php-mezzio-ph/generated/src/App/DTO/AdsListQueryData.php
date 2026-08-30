<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for adsList
 */
class AdsListQueryData
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
     * Entity status
     * @DTA\Data(field="entity_statuses", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\EntityStatus::class and collection format multi inside query string
     * @var \App\DTO\EntityStatus[]|null
     */
    public $entity_statuses;

    /**
     * List of Campaign Ids to use to filter the results.
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":250})
     * @var string[]|null
     */
    public $campaign_ids;

    /**
     * List of Ad Ids to use to filter the results.
     * @DTA\Data(field="ad_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":250})
     * @var string[]|null
     */
    public $ad_ids;

    /**
     * List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
     * @DTA\Data(field="ad_group_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":250})
     * @var string[]|null
     */
    public $ad_group_ids;

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

    /**
     * The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $order;

}
