<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for getInvites
 */
class GetInvitesQueryData
{
    /**
     * Invite type to filter invites by. Only invites of the specified type will be returned.
     * @DTA\Data(field="invite_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $invite_type;

    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bookmark;

    /**
     * A boolean field to indicate whether the invite is to create a partnership or a membership.
     * @DTA\Data(field="is_member", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_member;

    /**
     * A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
     * @DTA\Data(field="invite_status", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\InviteFilterStatus::class and collection format multi inside query string
     * @var \App\DTO\InviteFilterStatus[]|null
     */
    public $invite_status;

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
