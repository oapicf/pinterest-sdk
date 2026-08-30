<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Set of quality components, with each component containing a event coverage and details.
 */
class QualityComponents
{
    /**
     * @DTA\Data(field="advertiser_external_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection173::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection173::class})
     * @var \App\DTO\Collection173|null
     */
    public $advertiser_external_id;

    /**
     * @DTA\Data(field="click_id_epik", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection174::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection174::class})
     * @var \App\DTO\Collection174|null
     */
    public $click_id_epik;

    /**
     * Dedup components.
     * @DTA\Data(field="external_event_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection175::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection175::class})
     * @var \App\DTO\Collection175|null
     */
    public $external_event_id;

    /**
     * User matching identifiers.
     * @DTA\Data(field="hashed_email", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection176::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection176::class})
     * @var \App\DTO\Collection176|null
     */
    public $hashed_email;

    /**
     * @DTA\Data(field="hashed_maid", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection177::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection177::class})
     * @var \App\DTO\Collection177|null
     */
    public $hashed_maid;

    /**
     * @DTA\Data(field="ip_address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection178::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection178::class})
     * @var \App\DTO\Collection178|null
     */
    public $ip_address;

    /**
     * @DTA\Data(field="order_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection179::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection179::class})
     * @var \App\DTO\Collection179|null
     */
    public $order_id;

    /**
     * @DTA\Data(field="order_value", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection180::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection180::class})
     * @var \App\DTO\Collection180|null
     */
    public $order_value;

    /**
     * Product/event metadata.
     * @DTA\Data(field="product_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection181::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection181::class})
     * @var \App\DTO\Collection181|null
     */
    public $product_id;

    /**
     * @DTA\Data(field="source_url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection182::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection182::class})
     * @var \App\DTO\Collection182|null
     */
    public $source_url;

    /**
     * @DTA\Data(field="user_agent", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection183::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection183::class})
     * @var \App\DTO\Collection183|null
     */
    public $user_agent;

}
