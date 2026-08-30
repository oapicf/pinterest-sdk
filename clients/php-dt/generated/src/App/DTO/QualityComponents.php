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
     */
    public ?\App\DTO\Collection173 $advertiser_external_id = null;

    /**
     * @DTA\Data(field="click_id_epik", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection174::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection174::class})
     */
    public ?\App\DTO\Collection174 $click_id_epik = null;

    /**
     * Dedup components.
     * @DTA\Data(field="external_event_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection175::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection175::class})
     */
    public ?\App\DTO\Collection175 $external_event_id = null;

    /**
     * User matching identifiers.
     * @DTA\Data(field="hashed_email", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection176::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection176::class})
     */
    public ?\App\DTO\Collection176 $hashed_email = null;

    /**
     * @DTA\Data(field="hashed_maid", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection177::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection177::class})
     */
    public ?\App\DTO\Collection177 $hashed_maid = null;

    /**
     * @DTA\Data(field="ip_address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection178::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection178::class})
     */
    public ?\App\DTO\Collection178 $ip_address = null;

    /**
     * @DTA\Data(field="order_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection179::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection179::class})
     */
    public ?\App\DTO\Collection179 $order_id = null;

    /**
     * @DTA\Data(field="order_value", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection180::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection180::class})
     */
    public ?\App\DTO\Collection180 $order_value = null;

    /**
     * Product/event metadata.
     * @DTA\Data(field="product_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection181::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection181::class})
     */
    public ?\App\DTO\Collection181 $product_id = null;

    /**
     * @DTA\Data(field="source_url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection182::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection182::class})
     */
    public ?\App\DTO\Collection182 $source_url = null;

    /**
     * @DTA\Data(field="user_agent", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection183::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection183::class})
     */
    public ?\App\DTO\Collection183 $user_agent = null;

}
