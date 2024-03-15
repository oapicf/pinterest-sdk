<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for items_issues/list
 */
class ItemsIssuesListQueryData
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
     * Filter item validation issues that have a given type of item validation issue.
     * @DTA\Data(field="item_validation_issue", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $item_validation_issue;

    /**
     * Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.
     * @DTA\Data(field="item_numbers", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"int", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"int", "format":"multi"})
     * @var int[]|null
     */
    public $item_numbers;

    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @DTA\Data(field="page_size", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":250, "inclusive":true})
     * @var int|null
     */
    public $page_size;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

}
