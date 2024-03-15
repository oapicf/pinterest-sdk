<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdatableItemAttributes
{
    /**
     * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
     * @DTA\Data(field="ad_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_link;

    /**
     * Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
     * @DTA\Data(field="adult", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $adult;

    /**
     * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
     * @DTA\Data(field="age_group", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $age_group;

    /**
     * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
     * @DTA\Data(field="availability", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $availability;

    /**
     * Average reviews for the item. Can be a number from 1-5.
     * @DTA\Data(field="average_review_rating", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $average_review_rating;

    /**
     * The brand of the product.
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $brand;

    /**
     * This attribute is not supported anymore.
     * @DTA\Data(field="checkout_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $checkout_enabled;

    /**
     * The primary color of the product.
     * @DTA\Data(field="color", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $color;

    /**
     * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
     * @DTA\Data(field="condition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $condition;

    /**
     * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_0;

    /**
     * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_1;

    /**
     * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_2;

    /**
     * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_3;

    /**
     * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_4;

    /**
     * &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * The item is free to ship.
     * @DTA\Data(field="free_shipping_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $free_shipping_label;

    /**
     * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
     * @DTA\Data(field="free_shipping_limit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $free_shipping_limit;

    /**
     * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
     * @DTA\Data(field="gender", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $gender;

    /**
     * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @DTA\Data(field="google_product_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $google_product_category;

    /**
     * The unique universal product identifier.
     * @DTA\Data(field="gtin", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gtin;

    /**
     * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;
     * @DTA\Data(field="item_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_group_id;

    /**
     * The millisecond timestamp when the item was lastly modified by the merchant.
     * @DTA\Data(field="last_updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $last_updated_time;

    /**
     * &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $link;

    /**
     * The material used to make the product.
     * @DTA\Data(field="material", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $material;

    /**
     * The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="min_ad_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $min_ad_price;

    /**
     * The mobile-optimized version of your landing page. Must begin with http:// or https://.
     * @DTA\Data(field="mobile_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $mobile_link;

    /**
     * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
     * @DTA\Data(field="mpn", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $mpn;

    /**
     * The number of ratings for the item.
     * @DTA\Data(field="number_of_ratings", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $number_of_ratings;

    /**
     * The number of reviews available for the item.
     * @DTA\Data(field="number_of_reviews", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $number_of_reviews;

    /**
     * The description of the pattern used for the product.
     * @DTA\Data(field="pattern", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pattern;

    /**
     * The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $price;

    /**
     * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;
     * @DTA\Data(field="product_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_type;

    /**
     * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $sale_price;

    /**
     * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
     * @DTA\Data(field="shipping", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shipping;

    /**
     * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @DTA\Data(field="shipping_height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shipping_height;

    /**
     * The weight of the product. Ensure there is a space between the numeric string and the metric.
     * @DTA\Data(field="shipping_weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shipping_weight;

    /**
     * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @DTA\Data(field="shipping_width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shipping_width;

    /**
     * The size of the product.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $size;

    /**
     * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
     * @DTA\Data(field="size_system", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $size_system;

    /**
     * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
     * @DTA\Data(field="size_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $size_type;

    /**
     * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
     * @DTA\Data(field="tax", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $tax;

    /**
     * &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
     * @DTA\Data(field="variant_names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $variant_names;

    /**
     * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
     * @DTA\Data(field="variant_values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $variant_values;

}
