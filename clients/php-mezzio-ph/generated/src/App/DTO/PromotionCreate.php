<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class PromotionCreate
{
    /**
     * @DTA\Data(field="discount_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DiscountStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DiscountStatus::class})
     * @var \App\DTO\DiscountStatus|null
     */
    public $discount_status;

    /**
     * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
     * @DTA\Data(field="external_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":64})
     * @var string|null
     */
    public $external_id;

    /**
     * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
     * @DTA\Data(field="platform_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $platform_type;

    /**
     * Code that can be used to redeem a promotion.
     * @DTA\Data(field="promotion_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promotion_code;

    /**
     * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
     * @DTA\Data(field="promotion_custom_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":50})
     * @var string|null
     */
    public $promotion_custom_id;

    /**
     * Internal name for the promotion.
     * @DTA\Data(field="promotion_title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promotion_title;

    /**
     * @DTA\Data(field="promotion_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromotionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromotionType::class})
     * @var \App\DTO\PromotionType|null
     */
    public $promotion_type;

    /**
     * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * List of values to be inserted in the promotion type-specific template.
     * @DTA\Data(field="template_values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection265::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection265::class})
     * @var \App\DTO\Collection265|null
     */
    public $template_values;

}
