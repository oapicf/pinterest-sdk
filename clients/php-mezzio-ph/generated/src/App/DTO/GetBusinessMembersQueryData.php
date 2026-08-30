<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for getBusinessMembers
 */
class GetBusinessMembersQueryData
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
     * Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
     * @DTA\Data(field="assets_summary", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $assets_summary;

    /**
     * A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
     * @DTA\Data(field="business_roles", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\MemberBusinessRole::class and collection format multi inside query string
     * @var \App\DTO\MemberBusinessRole[]|null
     */
    public $business_roles;

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
     * A list of business members ids separated by comma.
     * @DTA\Data(field="member_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":500})
     * @var string|null
     */
    public $member_ids;

    /**
     * Fetches system users if True. Fetches regular user employees if False.
     * @DTA\Data(field="fetch_system_users", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $fetch_system_users;

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
