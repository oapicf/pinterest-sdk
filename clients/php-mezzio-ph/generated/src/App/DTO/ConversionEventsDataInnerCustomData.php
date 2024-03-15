<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object containing other custom data.
 */
class ConversionEventsDataInnerCustomData
{
    /**
     * The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $currency;

    /**
     * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

    /**
     * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
     * @DTA\Data(field="content_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection108::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection108::class})
     * @var \App\DTO\Collection108|null
     */
    public $content_ids;

    /**
     * The name of the page or product associated with the event.
     * @DTA\Data(field="content_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_name;

    /**
     * The category of the content associated with the event.
     * @DTA\Data(field="content_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_category;

    /**
     * The brand of the content associated with the event.
     * @DTA\Data(field="content_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_brand;

    /**
     * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
     * @DTA\Data(field="contents", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection109::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection109::class})
     * @var \App\DTO\Collection109|null
     */
    public $contents;

    /**
     * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
     * @DTA\Data(field="num_items", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $num_items;

    /**
     * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
     * @DTA\Data(field="order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $order_id;

    /**
     * The search string related to the user conversion event.
     * @DTA\Data(field="search_string", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $search_string;

    /**
     * Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up.
     * @DTA\Data(field="opt_out_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $opt_out_type;

    /**
     * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
     * @DTA\Data(field="np", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $np;

}
