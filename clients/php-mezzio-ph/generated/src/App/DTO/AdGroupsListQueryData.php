<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for ad_groups/list
 */
class AdGroupsListQueryData
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
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $entity_statuses;

    /**
     * List of Campaign Ids to use to filter the results.
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":100})
     * @var string[]|null
     */
    public $campaign_ids;

    /**
     * List of Ad group Ids to use to filter the results.
     * @DTA\Data(field="ad_group_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":100})
     * @var string[]|null
     */
    public $ad_group_ids;

    /**
     * Return interests as text names (if value is true) rather than topic IDs.
     * @DTA\Data(field="translate_interests_to_names", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $translate_interests_to_names;

    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @DTA\Data(field="page_size", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100, "inclusive":true})
     * @var int|null
     */
    public $page_size;

    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $order;

}
