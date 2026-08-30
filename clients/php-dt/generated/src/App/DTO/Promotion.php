<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Promotion
{
    /**
     * The Ad Account ID that this promotion belongs to.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * @DTA\Data(field="discount_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DiscountStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DiscountStatus::class})
     */
    public ?\App\DTO\DiscountStatus $discount_status = null;

    /**
     * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_time = null;

    /**
     * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
     * @DTA\Data(field="external_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":64})
     */
    public ?string $external_id = null;

    /**
     * Promotion ID
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":18})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
     * @DTA\Data(field="platform_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $platform_type = null;

    /**
     * Code that can be used to redeem a promotion.
     * @DTA\Data(field="promotion_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $promotion_code = null;

    /**
     * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
     * @DTA\Data(field="promotion_custom_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":50})
     */
    public ?string $promotion_custom_id = null;

    /**
     * Internal name for the promotion.
     * @DTA\Data(field="promotion_title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $promotion_title = null;

    /**
     * @DTA\Data(field="promotion_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromotionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromotionType::class})
     */
    public ?\App\DTO\PromotionType $promotion_type = null;

    /**
     * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $start_time = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * List of values to be inserted in the promotion type-specific template.
     * @DTA\Data(field="template_values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection263::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection263::class})
     */
    public ?\App\DTO\Collection263 $template_values = null;

}
