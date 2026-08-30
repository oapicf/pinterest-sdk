<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Created/updated resource on success or error details on failure
 */
class CampaignAdPreviewCreate200ResponseInnerData
{
    /**
     * Advertiser ID for this preview.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Ad group ID to create a preview record for.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * Client ID that created preview.
     * @DTA\Data(field="client_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $client_id;

    /**
     * Unix timestamp in milliseconds for preview expiration.
     * @DTA\Data(field="expires_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_at;

    /**
     * Whether preview link is active.
     * @DTA\Data(field="is_active")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_active;

    /**
     * Pin ID for pin promotion preview.
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pin_id;

    /**
     * Pin promotion ID for this preview.
     * @DTA\Data(field="pin_promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pin_promotion_id;

    /**
     * Promoted product group ID for catalog previews.
     * @DTA\Data(field="promoted_product_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $promoted_product_group_id;

    /**
     * Campaign ad preview URL.
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * User ID that created preview.
     * @DTA\Data(field="user_id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $user_id;

    /**
     * Pin promotion preview key.
     * @DTA\Data(field="uuid")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $uuid;

    /**
     * @DTA\Data(field="exceptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestLibError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestLibError::class})
     * @var \App\DTO\PinterestLibError|null
     */
    public $exceptions;

}
