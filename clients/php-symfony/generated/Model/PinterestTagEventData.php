<?php
/**
 * PinterestTagEventData
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the PinterestTagEventData model.
 *
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class PinterestTagEventData 
{
        /**
     * @var Currency|null
     * @SerializedName("currency")
        * @Accessor(getter="getSerializedCurrency")
        * @Type("string")
     */
    protected ?Currency $currency = null;

    /**
     * Promotion code. For example, \&quot;Newsletter\&quot;.
     *
     * @var string|null
     * @SerializedName("lead_type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $leadType = null;

    /**
     * @var LineItem|null
     * @SerializedName("line_items")
     * @Assert\Type("OpenAPI\Server\Model\LineItem")
     * @Type("OpenAPI\Server\Model\LineItem")
     */
    protected ?LineItem $lineItems = null;

    /**
     * Order ID. For example, \&quot;X-151481\&quot;.
     *
     * @var string|null
     * @SerializedName("order_id")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $orderId = null;

    /**
     * Order quantity. For example, 1.
     *
     * @var int|null
     * @SerializedName("order_quantity")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $orderQuantity = null;

    /**
     * Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.
     *
     * @var string|null
     * @SerializedName("page_name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $pageName = null;

    /**
     * Promotion code. For example, \&quot;WINTER10\&quot;.
     *
     * @var string|null
     * @SerializedName("promo_code")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $promoCode = null;

    /**
     * Property. For example, \&quot;Athleta\&quot;.
     *
     * @var string|null
     * @SerializedName("property")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $property = null;

    /**
     * Search query string. For example, \&quot;boots\&quot;.
     *
     * @var string|null
     * @SerializedName("search_query")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $searchQuery = null;

    /**
     * Product value. For example, \&quot;199.98\&quot;
     *
     * @var string|null
     * @SerializedName("value")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $value = null;

    /**
     * Video title. For example, \&quot;How to style your Parker Boots\&quot;.
     *
     * @var string|null
     * @SerializedName("video_title")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $videoTitle = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->currency = array_key_exists('currency', $data) ? $data['currency'] : $this->currency;
            $this->leadType = array_key_exists('leadType', $data) ? $data['leadType'] : $this->leadType;
            $this->lineItems = array_key_exists('lineItems', $data) ? $data['lineItems'] : $this->lineItems;
            $this->orderId = array_key_exists('orderId', $data) ? $data['orderId'] : $this->orderId;
            $this->orderQuantity = array_key_exists('orderQuantity', $data) ? $data['orderQuantity'] : $this->orderQuantity;
            $this->pageName = array_key_exists('pageName', $data) ? $data['pageName'] : $this->pageName;
            $this->promoCode = array_key_exists('promoCode', $data) ? $data['promoCode'] : $this->promoCode;
            $this->property = array_key_exists('property', $data) ? $data['property'] : $this->property;
            $this->searchQuery = array_key_exists('searchQuery', $data) ? $data['searchQuery'] : $this->searchQuery;
            $this->value = array_key_exists('value', $data) ? $data['value'] : $this->value;
            $this->videoTitle = array_key_exists('videoTitle', $data) ? $data['videoTitle'] : $this->videoTitle;
        }
    }

    /**
     * Gets currency.
     *
     * @return Currency|null
     */
    public function getCurrency(): ?Currency
    {
        return $this->currency;
    }

    /**
    * Gets currency for serialization.
    *
    * @return string|null
    */
    public function getSerializedCurrency(): string|null
    {
        return $this->currency?->value ? (string) $this->currency->value : null;
    }


    /**
     * Sets currency.
     *
     * @param Currency|null $currency
     *
     * @return $this
     */
    public function setCurrency(?Currency $currency = null): self
    {
        $this->currency = $currency;

        return $this;
    }

    /**
     * Gets leadType.
     *
     * @return string|null
     */
    public function getLeadType(): ?string
    {
        return $this->leadType;
    }



    /**
     * Sets leadType.
     *
     * @param string|null $leadType  Promotion code. For example, \"Newsletter\".
     *
     * @return $this
     */
    public function setLeadType(?string $leadType = null): self
    {
        $this->leadType = $leadType;

        return $this;
    }

    /**
     * Gets lineItems.
     *
     * @return LineItem|null
     */
    public function getLineItems(): ?LineItem
    {
        return $this->lineItems;
    }



    /**
     * Sets lineItems.
     *
     * @param LineItem|null $lineItems
     *
     * @return $this
     */
    public function setLineItems(?LineItem $lineItems = null): self
    {
        $this->lineItems = $lineItems;

        return $this;
    }

    /**
     * Gets orderId.
     *
     * @return string|null
     */
    public function getOrderId(): ?string
    {
        return $this->orderId;
    }



    /**
     * Sets orderId.
     *
     * @param string|null $orderId  Order ID. For example, \"X-151481\".
     *
     * @return $this
     */
    public function setOrderId(?string $orderId = null): self
    {
        $this->orderId = $orderId;

        return $this;
    }

    /**
     * Gets orderQuantity.
     *
     * @return int|null
     */
    public function getOrderQuantity(): ?int
    {
        return $this->orderQuantity;
    }



    /**
     * Sets orderQuantity.
     *
     * @param int|null $orderQuantity  Order quantity. For example, 1.
     *
     * @return $this
     */
    public function setOrderQuantity(?int $orderQuantity = null): self
    {
        $this->orderQuantity = $orderQuantity;

        return $this;
    }

    /**
     * Gets pageName.
     *
     * @return string|null
     */
    public function getPageName(): ?string
    {
        return $this->pageName;
    }



    /**
     * Sets pageName.
     *
     * @param string|null $pageName  Page name. For example, \"Our Favorite Pins on Pinterest\".
     *
     * @return $this
     */
    public function setPageName(?string $pageName = null): self
    {
        $this->pageName = $pageName;

        return $this;
    }

    /**
     * Gets promoCode.
     *
     * @return string|null
     */
    public function getPromoCode(): ?string
    {
        return $this->promoCode;
    }



    /**
     * Sets promoCode.
     *
     * @param string|null $promoCode  Promotion code. For example, \"WINTER10\".
     *
     * @return $this
     */
    public function setPromoCode(?string $promoCode = null): self
    {
        $this->promoCode = $promoCode;

        return $this;
    }

    /**
     * Gets property.
     *
     * @return string|null
     */
    public function getProperty(): ?string
    {
        return $this->property;
    }



    /**
     * Sets property.
     *
     * @param string|null $property  Property. For example, \"Athleta\".
     *
     * @return $this
     */
    public function setProperty(?string $property = null): self
    {
        $this->property = $property;

        return $this;
    }

    /**
     * Gets searchQuery.
     *
     * @return string|null
     */
    public function getSearchQuery(): ?string
    {
        return $this->searchQuery;
    }



    /**
     * Sets searchQuery.
     *
     * @param string|null $searchQuery  Search query string. For example, \"boots\".
     *
     * @return $this
     */
    public function setSearchQuery(?string $searchQuery = null): self
    {
        $this->searchQuery = $searchQuery;

        return $this;
    }

    /**
     * Gets value.
     *
     * @return string|null
     */
    public function getValue(): ?string
    {
        return $this->value;
    }



    /**
     * Sets value.
     *
     * @param string|null $value  Product value. For example, \"199.98\"
     *
     * @return $this
     */
    public function setValue(?string $value = null): self
    {
        $this->value = $value;

        return $this;
    }

    /**
     * Gets videoTitle.
     *
     * @return string|null
     */
    public function getVideoTitle(): ?string
    {
        return $this->videoTitle;
    }



    /**
     * Sets videoTitle.
     *
     * @param string|null $videoTitle  Video title. For example, \"How to style your Parker Boots\".
     *
     * @return $this
     */
    public function setVideoTitle(?string $videoTitle = null): self
    {
        $this->videoTitle = $videoTitle;

        return $this;
    }
}

