<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */
class PinterestTagEventData
{
    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency = null;

    /**
     * Promotion code. For example, \&quot;Newsletter\&quot;.
     * @DTA\Data(field="lead_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $lead_type = null;

    /**
     * @DTA\Data(field="line_items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LineItem::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LineItem::class})
     */
    public ?\App\DTO\LineItem $line_items = null;

    /**
     * Order ID. For example, \&quot;X-151481\&quot;.
     * @DTA\Data(field="order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_id = null;

    /**
     * Order quantity. For example, 1.
     * @DTA\Data(field="order_quantity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order_quantity = null;

    /**
     * Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.
     * @DTA\Data(field="page_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $page_name = null;

    /**
     * Promotion code. For example, \&quot;WINTER10\&quot;.
     * @DTA\Data(field="promo_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $promo_code = null;

    /**
     * Property. For example, \&quot;Athleta\&quot;.
     * @DTA\Data(field="property", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $property = null;

    /**
     * Search query string. For example, \&quot;boots\&quot;.
     * @DTA\Data(field="search_query", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $search_query = null;

    /**
     * Product value. For example, \&quot;199.98\&quot;
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

    /**
     * Video title. For example, \&quot;How to style your Parker Boots\&quot;.
     * @DTA\Data(field="video_title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $video_title = null;

}
