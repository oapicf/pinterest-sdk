<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object containing other custom data.
 */
class ConversionEventsDataItemsCustomData
{
    /**
     * The brand of the content associated with the event.
     * @DTA\Data(field="content_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content_brand = null;

    /**
     * The category of the content associated with the event.
     * @DTA\Data(field="content_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content_category = null;

    /**
     * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @DTA\Data(field="content_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection197::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection197::class})
     */
    public ?\App\DTO\Collection197 $content_ids = null;

    /**
     * The name of the page or product associated with the event.
     * @DTA\Data(field="content_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content_name = null;

    /**
     * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @DTA\Data(field="contents", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection198::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection198::class})
     */
    public ?\App\DTO\Collection198 $contents = null;

    /**
     * The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $currency = null;

    /**
     * Only use when instructed.
     * @DTA\Data(field="external_measurement_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $external_measurement_id = null;

    /**
     * Only use when instructed.
     * @DTA\Data(field="external_measurement_vendor_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $external_measurement_vendor_id = null;

    /**
     * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
     * @DTA\Data(field="np", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $np = null;

    /**
     * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @DTA\Data(field="num_items", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $num_items = null;

    /**
     * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
     * @DTA\Data(field="opt_out_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $opt_out_type = null;

    /**
     * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
     * @DTA\Data(field="order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_id = null;

    /**
     * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
     * @DTA\Data(field="predicted_ltv", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $predicted_ltv = null;

    /**
     * The search string related to the user conversion event.
     * @DTA\Data(field="search_string", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $search_string = null;

    /**
     * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

}
