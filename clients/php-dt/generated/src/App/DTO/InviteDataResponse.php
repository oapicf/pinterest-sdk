<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Metadata for the invite/request.
 */
class InviteDataResponse
{
    /**
     * The date and time when the invite/request will expire. Returned in milliseconds.
     * @DTA\Data(field="invite_expiration", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $invite_expiration = null;

    /**
     * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
     * @DTA\Data(field="invite_status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $invite_status = null;

    /**
     * The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
     * @DTA\Data(field="invite_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $invite_type = null;

    /**
     * The date and time the invite/request was last updated. Returned in milliseconds.
     * @DTA\Data(field="last_updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $last_updated_time = null;

    /**
     * The date and time the invite/request was sent/created. Returned in milliseconds.
     * @DTA\Data(field="sent_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $sent_at = null;

}
