<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Campaign ad preview record.
 */
class CampaignAdPreview
{
    /**
     * Advertiser ID for this preview.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Ad group ID to create a preview record for.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":18})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * Client ID that created preview.
     * @DTA\Data(field="client_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $client_id = null;

    /**
     * Unix timestamp in milliseconds for preview expiration.
     * @DTA\Data(field="expires_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $expires_at = null;

    /**
     * Whether preview link is active.
     * @DTA\Data(field="is_active")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_active = null;

    /**
     * Pin ID for pin promotion preview.
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pin_id = null;

    /**
     * Pin promotion ID for this preview.
     * @DTA\Data(field="pin_promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pin_promotion_id = null;

    /**
     * Promoted product group ID for catalog previews.
     * @DTA\Data(field="promoted_product_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $promoted_product_group_id = null;

    /**
     * Campaign ad preview URL.
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * User ID that created preview.
     * @DTA\Data(field="user_id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $user_id = null;

    /**
     * Pin promotion preview key.
     * @DTA\Data(field="uuid")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $uuid = null;

}
