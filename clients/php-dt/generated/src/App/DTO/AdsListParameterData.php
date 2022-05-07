<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for ads/list
 */
class AdsListParameterData
{
    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(subset="query", field="bookmark", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bookmark;

    /**
     * Entity status
     * @DTA\Data(subset="query", field="entity_statuses", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $entity_statuses;

    /**
     * List of Campaign Ids to use to filter the results.
     * @DTA\Data(subset="query", field="campaign_ids", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":100})
     * @var string[]|null
     */
    public $campaign_ids;

    /**
     * List of Ad Ids to use to filter the results.
     * @DTA\Data(subset="query", field="ad_ids", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":100})
     * @var string[]|null
     */
    public $ad_ids;

    /**
     * List of Ad group Ids to use to filter the results.
     * @DTA\Data(subset="query", field="ad_group_ids", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":100})
     * @var string[]|null
     */
    public $ad_group_ids;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="path", field="ad_account_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @DTA\Data(subset="query", field="page_size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(subset="query", name="LessThan", options={"max":100, "inclusive":true})
     * @var int|null
     */
    public $page_size;

    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @DTA\Data(subset="query", field="order", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $order;

}
