<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for labelsList
 */
class LabelsListQueryData
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
     * Label entity status
     * @DTA\Data(field="entity_statuses", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\QueryLabelEntityStatusesItems::class and collection format multi inside query string
     * @var \App\DTO\QueryLabelEntityStatusesItems[]|null
     */
    public $entity_statuses;

    /**
     * List of Label Ids to use to filter the results.
     * @DTA\Data(field="label_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":250})
     * @var string[]|null
     */
    public $label_ids;

    /**
     * List of Campaign Ids to use to filter the results.
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":250})
     * @var string[]|null
     */
    public $campaign_ids;

    /**
     * Label type.
     * @DTA\Data(field="label_types", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\QueryLabelTypesItems::class and collection format multi inside query string
     * @var \App\DTO\QueryLabelTypesItems[]|null
     */
    public $label_types;

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
