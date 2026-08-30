<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getInvites
 */
class GetInvitesParameterData
{
    /**
     * Invite type to filter invites by. Only invites of the specified type will be returned.
     * @DTA\Data(subset="query", field="invite_type", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $invite_type = null;

    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(subset="query", field="bookmark", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * A boolean field to indicate whether the invite is to create a partnership or a membership.
     * @DTA\Data(subset="query", field="is_member", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $is_member = null;

    /**
     * A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
     * @DTA\Data(subset="query", field="invite_status", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\InviteFilterStatus::class and collection format multi inside query string
     */
    public ?array $invite_status = null;

    /**
     * Unique identifier of the requesting business.
     * @DTA\Data(subset="path", field="business_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"min":1})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $business_id = null;

    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * @DTA\Data(subset="query", field="page_size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":1, "max":250})
     */
    public ?int $page_size = null;

}
