package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsAiContentDisclosure;
import org.openapitools.server.model.UpdatableItemAttributesGtin;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemAttributes   {

    private String adImage0Link;
    private String adImage0Tag;
    private String adImage10Link;
    private String adImage10Tag;
    private String adImage11Link;
    private String adImage11Tag;
    private String adImage12Link;
    private String adImage12Tag;
    private String adImage13Link;
    private String adImage13Tag;
    private String adImage14Link;
    private String adImage14Tag;
    private String adImage15Link;
    private String adImage15Tag;
    private String adImage16Link;
    private String adImage16Tag;
    private String adImage17Link;
    private String adImage17Tag;
    private String adImage18Link;
    private String adImage18Tag;
    private String adImage19Link;
    private String adImage19Tag;
    private String adImage1Link;
    private String adImage1Tag;
    private String adImage2Link;
    private String adImage2Tag;
    private String adImage3Link;
    private String adImage3Tag;
    private String adImage4Link;
    private String adImage4Tag;
    private String adImage5Link;
    private String adImage5Tag;
    private String adImage6Link;
    private String adImage6Tag;
    private String adImage7Link;
    private String adImage7Tag;
    private String adImage8Link;
    private String adImage8Tag;
    private String adImage9Link;
    private String adImage9Tag;
    private String adLink;
    private String adVideo0Link;
    private String adVideo0Tag;
    private String adVideo1Link;
    private String adVideo1Tag;
    private String adVideo2Link;
    private String adVideo2Tag;
    private Boolean adult;
    private String ageGroup;
    private String androidDeepLink;
    private String availability;
    private BigDecimal averageReviewRating;
    private String brand;
    private Boolean checkoutEnabled;
    private String color;
    private String condition;
    private String customLabel0;
    private String customLabel1;
    private String customLabel2;
    private String customLabel3;
    private String customLabel4;
    private Integer customNumber0;
    private Integer customNumber1;
    private Integer customNumber2;
    private Integer customNumber3;
    private Integer customNumber4;
    private String description;
    private Boolean freeShippingLabel;
    private String freeShippingLimit;
    private String gender;
    private String googleProductCategory;
    private UpdatableItemAttributesGtin gtin;
    private String id;
    private String installmentPrice;
    private String iosDeepLink;
    private String itemGroupId;
    private Long lastUpdatedTime;
    private String link;
    private String material;
    private String minAdPrice;
    private String mobileLink;
    private String mpn;
    private Integer numberOfRatings;
    private Integer numberOfReviews;
    private String pattern;
    private String price;
    private String productType;
    private String promotionId;
    private String salePrice;
    private String salePriceEffectiveDate;
    private String shipping;
    private String shippingHeight;
    private String shippingWeight;
    private String shippingWidth;
    private String size;
    private String sizeSystem;
    private String sizeType;
    private String tax;
    private String title;
    private String unitPricingBaseMeasure;
    private String unitPricingMeasure;
    private List<String> variantNames;
    private List<String> variantValues;
    private List<String> additionalImageLink;
    private List<@Valid CatalogsAiContentDisclosure> aiDisclosures = new ArrayList<>();
    private List<String> imageLink = new ArrayList<>();
    private String videoLink;

    /**
     * Default constructor.
     */
    public ItemAttributes() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemAttributes.
     *
     * @param adImage0Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage0Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage10Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage10Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage11Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage11Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage12Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage12Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage13Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage13Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage14Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage14Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage15Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage15Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage16Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage16Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage17Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage17Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage18Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage18Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage19Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage19Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage1Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage1Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage2Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage2Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage3Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage3Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage4Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage4Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage5Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage5Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage6Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage6Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage7Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage7Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage8Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage8Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adImage9Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adImage9Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
     * @param adVideo0Link Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adVideo0Tag Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @param adVideo1Link Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adVideo1Tag Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @param adVideo2Link Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @param adVideo2Tag Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @param adult Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.
     * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.
     * @param androidDeepLink The deep link to the product on the Android app.
     * @param availability The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.
     * @param averageReviewRating Average reviews for the item. Can be a number from 1-5.
     * @param brand The brand of the product.
     * @param checkoutEnabled This attribute is not supported anymore.
     * @param color The primary color of the product.
     * @param condition The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.
     * @param customLabel0 &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @param customLabel1 &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @param customLabel2 &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @param customLabel3 &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @param customLabel4 &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @param customNumber0 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @param customNumber1 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @param customNumber2 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @param customNumber3 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @param customNumber4 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @param description &lt;&#x3D; 10000 characters. The description of the product.
     * @param freeShippingLabel The item is free to ship.
     * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
     * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.
     * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @param gtin gtin
     * @param id &lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
     * @param installmentPrice Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;
     * @param iosDeepLink The deep link to the product on the iOS app.
     * @param itemGroupId &lt;&#x3D; 127 characters. The parent ID of the product.
     * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
     * @param link &lt;&#x3D; 511 characters. The landing page for the product.
     * @param material The material used to make the product.
     * @param minAdPrice The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
     * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://.
     * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
     * @param numberOfRatings The number of ratings for the item.
     * @param numberOfReviews The number of reviews available for the item.
     * @param pattern The description of the pattern used for the product.
     * @param price The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @param productType &lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.
     * @param promotionId A unique identifier referencing the promotion associated with this catalog item.
     * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.
     * @param salePriceEffectiveDate Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)
     * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
     * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric.
     * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @param size The size of the product.
     * @param sizeSystem Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.
     * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.
     * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
     * @param title &lt;&#x3D; 500 characters. The name of the product.
     * @param unitPricingBaseMeasure Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;
     * @param unitPricingMeasure Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;
     * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
     * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
     * @param additionalImageLink &lt;&#x3D; 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.
     * @param aiDisclosures AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.
     * @param imageLink &lt;&#x3D; 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
     * @param videoLink &lt;&#x3D; 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.
     */
    public ItemAttributes(
        String adImage0Link, 
        String adImage0Tag, 
        String adImage10Link, 
        String adImage10Tag, 
        String adImage11Link, 
        String adImage11Tag, 
        String adImage12Link, 
        String adImage12Tag, 
        String adImage13Link, 
        String adImage13Tag, 
        String adImage14Link, 
        String adImage14Tag, 
        String adImage15Link, 
        String adImage15Tag, 
        String adImage16Link, 
        String adImage16Tag, 
        String adImage17Link, 
        String adImage17Tag, 
        String adImage18Link, 
        String adImage18Tag, 
        String adImage19Link, 
        String adImage19Tag, 
        String adImage1Link, 
        String adImage1Tag, 
        String adImage2Link, 
        String adImage2Tag, 
        String adImage3Link, 
        String adImage3Tag, 
        String adImage4Link, 
        String adImage4Tag, 
        String adImage5Link, 
        String adImage5Tag, 
        String adImage6Link, 
        String adImage6Tag, 
        String adImage7Link, 
        String adImage7Tag, 
        String adImage8Link, 
        String adImage8Tag, 
        String adImage9Link, 
        String adImage9Tag, 
        String adLink, 
        String adVideo0Link, 
        String adVideo0Tag, 
        String adVideo1Link, 
        String adVideo1Tag, 
        String adVideo2Link, 
        String adVideo2Tag, 
        Boolean adult, 
        String ageGroup, 
        String androidDeepLink, 
        String availability, 
        BigDecimal averageReviewRating, 
        String brand, 
        Boolean checkoutEnabled, 
        String color, 
        String condition, 
        String customLabel0, 
        String customLabel1, 
        String customLabel2, 
        String customLabel3, 
        String customLabel4, 
        Integer customNumber0, 
        Integer customNumber1, 
        Integer customNumber2, 
        Integer customNumber3, 
        Integer customNumber4, 
        String description, 
        Boolean freeShippingLabel, 
        String freeShippingLimit, 
        String gender, 
        String googleProductCategory, 
        UpdatableItemAttributesGtin gtin, 
        String id, 
        String installmentPrice, 
        String iosDeepLink, 
        String itemGroupId, 
        Long lastUpdatedTime, 
        String link, 
        String material, 
        String minAdPrice, 
        String mobileLink, 
        String mpn, 
        Integer numberOfRatings, 
        Integer numberOfReviews, 
        String pattern, 
        String price, 
        String productType, 
        String promotionId, 
        String salePrice, 
        String salePriceEffectiveDate, 
        String shipping, 
        String shippingHeight, 
        String shippingWeight, 
        String shippingWidth, 
        String size, 
        String sizeSystem, 
        String sizeType, 
        String tax, 
        String title, 
        String unitPricingBaseMeasure, 
        String unitPricingMeasure, 
        List<String> variantNames, 
        List<String> variantValues, 
        List<String> additionalImageLink, 
        List<@Valid CatalogsAiContentDisclosure> aiDisclosures, 
        List<String> imageLink, 
        String videoLink
    ) {
        this.adImage0Link = adImage0Link;
        this.adImage0Tag = adImage0Tag;
        this.adImage10Link = adImage10Link;
        this.adImage10Tag = adImage10Tag;
        this.adImage11Link = adImage11Link;
        this.adImage11Tag = adImage11Tag;
        this.adImage12Link = adImage12Link;
        this.adImage12Tag = adImage12Tag;
        this.adImage13Link = adImage13Link;
        this.adImage13Tag = adImage13Tag;
        this.adImage14Link = adImage14Link;
        this.adImage14Tag = adImage14Tag;
        this.adImage15Link = adImage15Link;
        this.adImage15Tag = adImage15Tag;
        this.adImage16Link = adImage16Link;
        this.adImage16Tag = adImage16Tag;
        this.adImage17Link = adImage17Link;
        this.adImage17Tag = adImage17Tag;
        this.adImage18Link = adImage18Link;
        this.adImage18Tag = adImage18Tag;
        this.adImage19Link = adImage19Link;
        this.adImage19Tag = adImage19Tag;
        this.adImage1Link = adImage1Link;
        this.adImage1Tag = adImage1Tag;
        this.adImage2Link = adImage2Link;
        this.adImage2Tag = adImage2Tag;
        this.adImage3Link = adImage3Link;
        this.adImage3Tag = adImage3Tag;
        this.adImage4Link = adImage4Link;
        this.adImage4Tag = adImage4Tag;
        this.adImage5Link = adImage5Link;
        this.adImage5Tag = adImage5Tag;
        this.adImage6Link = adImage6Link;
        this.adImage6Tag = adImage6Tag;
        this.adImage7Link = adImage7Link;
        this.adImage7Tag = adImage7Tag;
        this.adImage8Link = adImage8Link;
        this.adImage8Tag = adImage8Tag;
        this.adImage9Link = adImage9Link;
        this.adImage9Tag = adImage9Tag;
        this.adLink = adLink;
        this.adVideo0Link = adVideo0Link;
        this.adVideo0Tag = adVideo0Tag;
        this.adVideo1Link = adVideo1Link;
        this.adVideo1Tag = adVideo1Tag;
        this.adVideo2Link = adVideo2Link;
        this.adVideo2Tag = adVideo2Tag;
        this.adult = adult;
        this.ageGroup = ageGroup;
        this.androidDeepLink = androidDeepLink;
        this.availability = availability;
        this.averageReviewRating = averageReviewRating;
        this.brand = brand;
        this.checkoutEnabled = checkoutEnabled;
        this.color = color;
        this.condition = condition;
        this.customLabel0 = customLabel0;
        this.customLabel1 = customLabel1;
        this.customLabel2 = customLabel2;
        this.customLabel3 = customLabel3;
        this.customLabel4 = customLabel4;
        this.customNumber0 = customNumber0;
        this.customNumber1 = customNumber1;
        this.customNumber2 = customNumber2;
        this.customNumber3 = customNumber3;
        this.customNumber4 = customNumber4;
        this.description = description;
        this.freeShippingLabel = freeShippingLabel;
        this.freeShippingLimit = freeShippingLimit;
        this.gender = gender;
        this.googleProductCategory = googleProductCategory;
        this.gtin = gtin;
        this.id = id;
        this.installmentPrice = installmentPrice;
        this.iosDeepLink = iosDeepLink;
        this.itemGroupId = itemGroupId;
        this.lastUpdatedTime = lastUpdatedTime;
        this.link = link;
        this.material = material;
        this.minAdPrice = minAdPrice;
        this.mobileLink = mobileLink;
        this.mpn = mpn;
        this.numberOfRatings = numberOfRatings;
        this.numberOfReviews = numberOfReviews;
        this.pattern = pattern;
        this.price = price;
        this.productType = productType;
        this.promotionId = promotionId;
        this.salePrice = salePrice;
        this.salePriceEffectiveDate = salePriceEffectiveDate;
        this.shipping = shipping;
        this.shippingHeight = shippingHeight;
        this.shippingWeight = shippingWeight;
        this.shippingWidth = shippingWidth;
        this.size = size;
        this.sizeSystem = sizeSystem;
        this.sizeType = sizeType;
        this.tax = tax;
        this.title = title;
        this.unitPricingBaseMeasure = unitPricingBaseMeasure;
        this.unitPricingMeasure = unitPricingMeasure;
        this.variantNames = variantNames;
        this.variantValues = variantValues;
        this.additionalImageLink = additionalImageLink;
        this.aiDisclosures = aiDisclosures;
        this.imageLink = imageLink;
        this.videoLink = videoLink;
    }



    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage0Link
     */
    public String getAdImage0Link() {
        return adImage0Link;
    }

    public void setAdImage0Link(String adImage0Link) {
        this.adImage0Link = adImage0Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage0Tag
     */
    public String getAdImage0Tag() {
        return adImage0Tag;
    }

    public void setAdImage0Tag(String adImage0Tag) {
        this.adImage0Tag = adImage0Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage10Link
     */
    public String getAdImage10Link() {
        return adImage10Link;
    }

    public void setAdImage10Link(String adImage10Link) {
        this.adImage10Link = adImage10Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage10Tag
     */
    public String getAdImage10Tag() {
        return adImage10Tag;
    }

    public void setAdImage10Tag(String adImage10Tag) {
        this.adImage10Tag = adImage10Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage11Link
     */
    public String getAdImage11Link() {
        return adImage11Link;
    }

    public void setAdImage11Link(String adImage11Link) {
        this.adImage11Link = adImage11Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage11Tag
     */
    public String getAdImage11Tag() {
        return adImage11Tag;
    }

    public void setAdImage11Tag(String adImage11Tag) {
        this.adImage11Tag = adImage11Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage12Link
     */
    public String getAdImage12Link() {
        return adImage12Link;
    }

    public void setAdImage12Link(String adImage12Link) {
        this.adImage12Link = adImage12Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage12Tag
     */
    public String getAdImage12Tag() {
        return adImage12Tag;
    }

    public void setAdImage12Tag(String adImage12Tag) {
        this.adImage12Tag = adImage12Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage13Link
     */
    public String getAdImage13Link() {
        return adImage13Link;
    }

    public void setAdImage13Link(String adImage13Link) {
        this.adImage13Link = adImage13Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage13Tag
     */
    public String getAdImage13Tag() {
        return adImage13Tag;
    }

    public void setAdImage13Tag(String adImage13Tag) {
        this.adImage13Tag = adImage13Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage14Link
     */
    public String getAdImage14Link() {
        return adImage14Link;
    }

    public void setAdImage14Link(String adImage14Link) {
        this.adImage14Link = adImage14Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage14Tag
     */
    public String getAdImage14Tag() {
        return adImage14Tag;
    }

    public void setAdImage14Tag(String adImage14Tag) {
        this.adImage14Tag = adImage14Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage15Link
     */
    public String getAdImage15Link() {
        return adImage15Link;
    }

    public void setAdImage15Link(String adImage15Link) {
        this.adImage15Link = adImage15Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage15Tag
     */
    public String getAdImage15Tag() {
        return adImage15Tag;
    }

    public void setAdImage15Tag(String adImage15Tag) {
        this.adImage15Tag = adImage15Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage16Link
     */
    public String getAdImage16Link() {
        return adImage16Link;
    }

    public void setAdImage16Link(String adImage16Link) {
        this.adImage16Link = adImage16Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage16Tag
     */
    public String getAdImage16Tag() {
        return adImage16Tag;
    }

    public void setAdImage16Tag(String adImage16Tag) {
        this.adImage16Tag = adImage16Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage17Link
     */
    public String getAdImage17Link() {
        return adImage17Link;
    }

    public void setAdImage17Link(String adImage17Link) {
        this.adImage17Link = adImage17Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage17Tag
     */
    public String getAdImage17Tag() {
        return adImage17Tag;
    }

    public void setAdImage17Tag(String adImage17Tag) {
        this.adImage17Tag = adImage17Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage18Link
     */
    public String getAdImage18Link() {
        return adImage18Link;
    }

    public void setAdImage18Link(String adImage18Link) {
        this.adImage18Link = adImage18Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage18Tag
     */
    public String getAdImage18Tag() {
        return adImage18Tag;
    }

    public void setAdImage18Tag(String adImage18Tag) {
        this.adImage18Tag = adImage18Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage19Link
     */
    public String getAdImage19Link() {
        return adImage19Link;
    }

    public void setAdImage19Link(String adImage19Link) {
        this.adImage19Link = adImage19Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage19Tag
     */
    public String getAdImage19Tag() {
        return adImage19Tag;
    }

    public void setAdImage19Tag(String adImage19Tag) {
        this.adImage19Tag = adImage19Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage1Link
     */
    public String getAdImage1Link() {
        return adImage1Link;
    }

    public void setAdImage1Link(String adImage1Link) {
        this.adImage1Link = adImage1Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage1Tag
     */
    public String getAdImage1Tag() {
        return adImage1Tag;
    }

    public void setAdImage1Tag(String adImage1Tag) {
        this.adImage1Tag = adImage1Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage2Link
     */
    public String getAdImage2Link() {
        return adImage2Link;
    }

    public void setAdImage2Link(String adImage2Link) {
        this.adImage2Link = adImage2Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage2Tag
     */
    public String getAdImage2Tag() {
        return adImage2Tag;
    }

    public void setAdImage2Tag(String adImage2Tag) {
        this.adImage2Tag = adImage2Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage3Link
     */
    public String getAdImage3Link() {
        return adImage3Link;
    }

    public void setAdImage3Link(String adImage3Link) {
        this.adImage3Link = adImage3Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage3Tag
     */
    public String getAdImage3Tag() {
        return adImage3Tag;
    }

    public void setAdImage3Tag(String adImage3Tag) {
        this.adImage3Tag = adImage3Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage4Link
     */
    public String getAdImage4Link() {
        return adImage4Link;
    }

    public void setAdImage4Link(String adImage4Link) {
        this.adImage4Link = adImage4Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage4Tag
     */
    public String getAdImage4Tag() {
        return adImage4Tag;
    }

    public void setAdImage4Tag(String adImage4Tag) {
        this.adImage4Tag = adImage4Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage5Link
     */
    public String getAdImage5Link() {
        return adImage5Link;
    }

    public void setAdImage5Link(String adImage5Link) {
        this.adImage5Link = adImage5Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage5Tag
     */
    public String getAdImage5Tag() {
        return adImage5Tag;
    }

    public void setAdImage5Tag(String adImage5Tag) {
        this.adImage5Tag = adImage5Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage6Link
     */
    public String getAdImage6Link() {
        return adImage6Link;
    }

    public void setAdImage6Link(String adImage6Link) {
        this.adImage6Link = adImage6Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage6Tag
     */
    public String getAdImage6Tag() {
        return adImage6Tag;
    }

    public void setAdImage6Tag(String adImage6Tag) {
        this.adImage6Tag = adImage6Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage7Link
     */
    public String getAdImage7Link() {
        return adImage7Link;
    }

    public void setAdImage7Link(String adImage7Link) {
        this.adImage7Link = adImage7Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage7Tag
     */
    public String getAdImage7Tag() {
        return adImage7Tag;
    }

    public void setAdImage7Tag(String adImage7Tag) {
        this.adImage7Tag = adImage7Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage8Link
     */
    public String getAdImage8Link() {
        return adImage8Link;
    }

    public void setAdImage8Link(String adImage8Link) {
        this.adImage8Link = adImage8Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage8Tag
     */
    public String getAdImage8Tag() {
        return adImage8Tag;
    }

    public void setAdImage8Tag(String adImage8Tag) {
        this.adImage8Tag = adImage8Tag;
    }

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adImage9Link
     */
    public String getAdImage9Link() {
        return adImage9Link;
    }

    public void setAdImage9Link(String adImage9Link) {
        this.adImage9Link = adImage9Link;
    }

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @return adImage9Tag
     */
    public String getAdImage9Tag() {
        return adImage9Tag;
    }

    public void setAdImage9Tag(String adImage9Tag) {
        this.adImage9Tag = adImage9Tag;
    }

    /**
     * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
     * @return adLink
     */
    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adVideo0Link
     */
    public String getAdVideo0Link() {
        return adVideo0Link;
    }

    public void setAdVideo0Link(String adVideo0Link) {
        this.adVideo0Link = adVideo0Link;
    }

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @return adVideo0Tag
     */
    public String getAdVideo0Tag() {
        return adVideo0Tag;
    }

    public void setAdVideo0Tag(String adVideo0Tag) {
        this.adVideo0Tag = adVideo0Tag;
    }

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adVideo1Link
     */
    public String getAdVideo1Link() {
        return adVideo1Link;
    }

    public void setAdVideo1Link(String adVideo1Link) {
        this.adVideo1Link = adVideo1Link;
    }

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @return adVideo1Tag
     */
    public String getAdVideo1Tag() {
        return adVideo1Tag;
    }

    public void setAdVideo1Tag(String adVideo1Tag) {
        this.adVideo1Tag = adVideo1Tag;
    }

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @return adVideo2Link
     */
    public String getAdVideo2Link() {
        return adVideo2Link;
    }

    public void setAdVideo2Link(String adVideo2Link) {
        this.adVideo2Link = adVideo2Link;
    }

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @return adVideo2Tag
     */
    public String getAdVideo2Tag() {
        return adVideo2Tag;
    }

    public void setAdVideo2Tag(String adVideo2Tag) {
        this.adVideo2Tag = adVideo2Tag;
    }

    /**
     * Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
     * @return adult
     */
    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    /**
     * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
     * @return ageGroup
     */
    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    /**
     * The deep link to the product on the Android app.
     * @return androidDeepLink
     */
    public String getAndroidDeepLink() {
        return androidDeepLink;
    }

    public void setAndroidDeepLink(String androidDeepLink) {
        this.androidDeepLink = androidDeepLink;
    }

    /**
     * The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.
     * @return availability
     */
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Average reviews for the item. Can be a number from 1-5.
     * @return averageReviewRating
     */
    public BigDecimal getAverageReviewRating() {
        return averageReviewRating;
    }

    public void setAverageReviewRating(BigDecimal averageReviewRating) {
        this.averageReviewRating = averageReviewRating;
    }

    /**
     * The brand of the product.
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This attribute is not supported anymore.
     * @return checkoutEnabled
     */
    public Boolean getCheckoutEnabled() {
        return checkoutEnabled;
    }

    public void setCheckoutEnabled(Boolean checkoutEnabled) {
        this.checkoutEnabled = checkoutEnabled;
    }

    /**
     * The primary color of the product.
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
     * @return customLabel0
     */
    public String getCustomLabel0() {
        return customLabel0;
    }

    public void setCustomLabel0(String customLabel0) {
        this.customLabel0 = customLabel0;
    }

    /**
     * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
     * @return customLabel1
     */
    public String getCustomLabel1() {
        return customLabel1;
    }

    public void setCustomLabel1(String customLabel1) {
        this.customLabel1 = customLabel1;
    }

    /**
     * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
     * @return customLabel2
     */
    public String getCustomLabel2() {
        return customLabel2;
    }

    public void setCustomLabel2(String customLabel2) {
        this.customLabel2 = customLabel2;
    }

    /**
     * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
     * @return customLabel3
     */
    public String getCustomLabel3() {
        return customLabel3;
    }

    public void setCustomLabel3(String customLabel3) {
        this.customLabel3 = customLabel3;
    }

    /**
     * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
     * @return customLabel4
     */
    public String getCustomLabel4() {
        return customLabel4;
    }

    public void setCustomLabel4(String customLabel4) {
        this.customLabel4 = customLabel4;
    }

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @return customNumber0
     */
    public Integer getCustomNumber0() {
        return customNumber0;
    }

    public void setCustomNumber0(Integer customNumber0) {
        this.customNumber0 = customNumber0;
    }

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @return customNumber1
     */
    public Integer getCustomNumber1() {
        return customNumber1;
    }

    public void setCustomNumber1(Integer customNumber1) {
        this.customNumber1 = customNumber1;
    }

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @return customNumber2
     */
    public Integer getCustomNumber2() {
        return customNumber2;
    }

    public void setCustomNumber2(Integer customNumber2) {
        this.customNumber2 = customNumber2;
    }

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @return customNumber3
     */
    public Integer getCustomNumber3() {
        return customNumber3;
    }

    public void setCustomNumber3(Integer customNumber3) {
        this.customNumber3 = customNumber3;
    }

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @return customNumber4
     */
    public Integer getCustomNumber4() {
        return customNumber4;
    }

    public void setCustomNumber4(Integer customNumber4) {
        this.customNumber4 = customNumber4;
    }

    /**
     * <= 10000 characters. The description of the product.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The item is free to ship.
     * @return freeShippingLabel
     */
    public Boolean getFreeShippingLabel() {
        return freeShippingLabel;
    }

    public void setFreeShippingLabel(Boolean freeShippingLabel) {
        this.freeShippingLabel = freeShippingLabel;
    }

    /**
     * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
     * @return freeShippingLimit
     */
    public String getFreeShippingLimit() {
        return freeShippingLimit;
    }

    public void setFreeShippingLimit(String freeShippingLimit) {
        this.freeShippingLimit = freeShippingLimit;
    }

    /**
     * The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @return googleProductCategory
     */
    public String getGoogleProductCategory() {
        return googleProductCategory;
    }

    public void setGoogleProductCategory(String googleProductCategory) {
        this.googleProductCategory = googleProductCategory;
    }

    /**
     * Get gtin
     * @return gtin
     */
    public UpdatableItemAttributesGtin getGtin() {
        return gtin;
    }

    public void setGtin(UpdatableItemAttributesGtin gtin) {
        this.gtin = gtin;
    }

    /**
     * <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>
     * @return installmentPrice
     */
    public String getInstallmentPrice() {
        return installmentPrice;
    }

    public void setInstallmentPrice(String installmentPrice) {
        this.installmentPrice = installmentPrice;
    }

    /**
     * The deep link to the product on the iOS app.
     * @return iosDeepLink
     */
    public String getIosDeepLink() {
        return iosDeepLink;
    }

    public void setIosDeepLink(String iosDeepLink) {
        this.iosDeepLink = iosDeepLink;
    }

    /**
     * <= 127 characters. The parent ID of the product.
     * @return itemGroupId
     */
    public String getItemGroupId() {
        return itemGroupId;
    }

    public void setItemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    /**
     * The millisecond timestamp when the item was lastly modified by the merchant.
     * @return lastUpdatedTime
     */
    public Long getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <= 511 characters. The landing page for the product.
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * The material used to make the product.
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
     * @return minAdPrice
     */
    public String getMinAdPrice() {
        return minAdPrice;
    }

    public void setMinAdPrice(String minAdPrice) {
        this.minAdPrice = minAdPrice;
    }

    /**
     * The mobile-optimized version of your landing page. Must begin with http:// or https://.
     * @return mobileLink
     */
    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    /**
     * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
     * @return mpn
     */
    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    /**
     * The number of ratings for the item.
     * @return numberOfRatings
     */
    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    /**
     * The number of reviews available for the item.
     * @return numberOfReviews
     */
    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    /**
     * The description of the pattern used for the product.
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
     * @return price
     */
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * <= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * A unique identifier referencing the promotion associated with this catalog item.
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".
     * @return salePrice
     */
    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
     * @return salePriceEffectiveDate
     */
    public String getSalePriceEffectiveDate() {
        return salePriceEffectiveDate;
    }

    public void setSalePriceEffectiveDate(String salePriceEffectiveDate) {
        this.salePriceEffectiveDate = salePriceEffectiveDate;
    }

    /**
     * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
     * @return shipping
     */
    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    /**
     * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @return shippingHeight
     */
    public String getShippingHeight() {
        return shippingHeight;
    }

    public void setShippingHeight(String shippingHeight) {
        this.shippingHeight = shippingHeight;
    }

    /**
     * The weight of the product. Ensure there is a space between the numeric string and the metric.
     * @return shippingWeight
     */
    public String getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(String shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    /**
     * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @return shippingWidth
     */
    public String getShippingWidth() {
        return shippingWidth;
    }

    public void setShippingWidth(String shippingWidth) {
        this.shippingWidth = shippingWidth;
    }

    /**
     * The size of the product.
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
     * @return sizeSystem
     */
    public String getSizeSystem() {
        return sizeSystem;
    }

    public void setSizeSystem(String sizeSystem) {
        this.sizeSystem = sizeSystem;
    }

    /**
     * Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
     * @return sizeType
     */
    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    /**
     * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
     * @return tax
     */
    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * <= 500 characters. The name of the product.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
     * @return unitPricingBaseMeasure
     */
    public String getUnitPricingBaseMeasure() {
        return unitPricingBaseMeasure;
    }

    public void setUnitPricingBaseMeasure(String unitPricingBaseMeasure) {
        this.unitPricingBaseMeasure = unitPricingBaseMeasure;
    }

    /**
     * Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
     * @return unitPricingMeasure
     */
    public String getUnitPricingMeasure() {
        return unitPricingMeasure;
    }

    public void setUnitPricingMeasure(String unitPricingMeasure) {
        this.unitPricingMeasure = unitPricingMeasure;
    }

    /**
     * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
     * @return variantNames
     */
    public List<String> getVariantNames() {
        return variantNames;
    }

    public void setVariantNames(List<String> variantNames) {
        this.variantNames = variantNames;
    }

    /**
     * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
     * @return variantValues
     */
    public List<String> getVariantValues() {
        return variantValues;
    }

    public void setVariantValues(List<String> variantValues) {
        this.variantValues = variantValues;
    }

    /**
     * <= 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.
     * @return additionalImageLink
     */
    public List<String> getAdditionalImageLink() {
        return additionalImageLink;
    }

    public void setAdditionalImageLink(List<String> additionalImageLink) {
        this.additionalImageLink = additionalImageLink;
    }

    /**
     * AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.
     * @return aiDisclosures
     */
    public List<@Valid CatalogsAiContentDisclosure> getAiDisclosures() {
        return aiDisclosures;
    }

    public void setAiDisclosures(List<@Valid CatalogsAiContentDisclosure> aiDisclosures) {
        this.aiDisclosures = aiDisclosures;
    }

    /**
     * <= 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
     * @return imageLink
     */
    public List<String> getImageLink() {
        return imageLink;
    }

    public void setImageLink(List<String> imageLink) {
        this.imageLink = imageLink;
    }

    /**
     * <= 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.
     * @return videoLink
     */
    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemAttributes {\n");
        
        sb.append("    adImage0Link: ").append(toIndentedString(adImage0Link)).append("\n");
        sb.append("    adImage0Tag: ").append(toIndentedString(adImage0Tag)).append("\n");
        sb.append("    adImage10Link: ").append(toIndentedString(adImage10Link)).append("\n");
        sb.append("    adImage10Tag: ").append(toIndentedString(adImage10Tag)).append("\n");
        sb.append("    adImage11Link: ").append(toIndentedString(adImage11Link)).append("\n");
        sb.append("    adImage11Tag: ").append(toIndentedString(adImage11Tag)).append("\n");
        sb.append("    adImage12Link: ").append(toIndentedString(adImage12Link)).append("\n");
        sb.append("    adImage12Tag: ").append(toIndentedString(adImage12Tag)).append("\n");
        sb.append("    adImage13Link: ").append(toIndentedString(adImage13Link)).append("\n");
        sb.append("    adImage13Tag: ").append(toIndentedString(adImage13Tag)).append("\n");
        sb.append("    adImage14Link: ").append(toIndentedString(adImage14Link)).append("\n");
        sb.append("    adImage14Tag: ").append(toIndentedString(adImage14Tag)).append("\n");
        sb.append("    adImage15Link: ").append(toIndentedString(adImage15Link)).append("\n");
        sb.append("    adImage15Tag: ").append(toIndentedString(adImage15Tag)).append("\n");
        sb.append("    adImage16Link: ").append(toIndentedString(adImage16Link)).append("\n");
        sb.append("    adImage16Tag: ").append(toIndentedString(adImage16Tag)).append("\n");
        sb.append("    adImage17Link: ").append(toIndentedString(adImage17Link)).append("\n");
        sb.append("    adImage17Tag: ").append(toIndentedString(adImage17Tag)).append("\n");
        sb.append("    adImage18Link: ").append(toIndentedString(adImage18Link)).append("\n");
        sb.append("    adImage18Tag: ").append(toIndentedString(adImage18Tag)).append("\n");
        sb.append("    adImage19Link: ").append(toIndentedString(adImage19Link)).append("\n");
        sb.append("    adImage19Tag: ").append(toIndentedString(adImage19Tag)).append("\n");
        sb.append("    adImage1Link: ").append(toIndentedString(adImage1Link)).append("\n");
        sb.append("    adImage1Tag: ").append(toIndentedString(adImage1Tag)).append("\n");
        sb.append("    adImage2Link: ").append(toIndentedString(adImage2Link)).append("\n");
        sb.append("    adImage2Tag: ").append(toIndentedString(adImage2Tag)).append("\n");
        sb.append("    adImage3Link: ").append(toIndentedString(adImage3Link)).append("\n");
        sb.append("    adImage3Tag: ").append(toIndentedString(adImage3Tag)).append("\n");
        sb.append("    adImage4Link: ").append(toIndentedString(adImage4Link)).append("\n");
        sb.append("    adImage4Tag: ").append(toIndentedString(adImage4Tag)).append("\n");
        sb.append("    adImage5Link: ").append(toIndentedString(adImage5Link)).append("\n");
        sb.append("    adImage5Tag: ").append(toIndentedString(adImage5Tag)).append("\n");
        sb.append("    adImage6Link: ").append(toIndentedString(adImage6Link)).append("\n");
        sb.append("    adImage6Tag: ").append(toIndentedString(adImage6Tag)).append("\n");
        sb.append("    adImage7Link: ").append(toIndentedString(adImage7Link)).append("\n");
        sb.append("    adImage7Tag: ").append(toIndentedString(adImage7Tag)).append("\n");
        sb.append("    adImage8Link: ").append(toIndentedString(adImage8Link)).append("\n");
        sb.append("    adImage8Tag: ").append(toIndentedString(adImage8Tag)).append("\n");
        sb.append("    adImage9Link: ").append(toIndentedString(adImage9Link)).append("\n");
        sb.append("    adImage9Tag: ").append(toIndentedString(adImage9Tag)).append("\n");
        sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
        sb.append("    adVideo0Link: ").append(toIndentedString(adVideo0Link)).append("\n");
        sb.append("    adVideo0Tag: ").append(toIndentedString(adVideo0Tag)).append("\n");
        sb.append("    adVideo1Link: ").append(toIndentedString(adVideo1Link)).append("\n");
        sb.append("    adVideo1Tag: ").append(toIndentedString(adVideo1Tag)).append("\n");
        sb.append("    adVideo2Link: ").append(toIndentedString(adVideo2Link)).append("\n");
        sb.append("    adVideo2Tag: ").append(toIndentedString(adVideo2Tag)).append("\n");
        sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
        sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
        sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    averageReviewRating: ").append(toIndentedString(averageReviewRating)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    checkoutEnabled: ").append(toIndentedString(checkoutEnabled)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
        sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
        sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
        sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
        sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
        sb.append("    customNumber0: ").append(toIndentedString(customNumber0)).append("\n");
        sb.append("    customNumber1: ").append(toIndentedString(customNumber1)).append("\n");
        sb.append("    customNumber2: ").append(toIndentedString(customNumber2)).append("\n");
        sb.append("    customNumber3: ").append(toIndentedString(customNumber3)).append("\n");
        sb.append("    customNumber4: ").append(toIndentedString(customNumber4)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    freeShippingLabel: ").append(toIndentedString(freeShippingLabel)).append("\n");
        sb.append("    freeShippingLimit: ").append(toIndentedString(freeShippingLimit)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    googleProductCategory: ").append(toIndentedString(googleProductCategory)).append("\n");
        sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    installmentPrice: ").append(toIndentedString(installmentPrice)).append("\n");
        sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
        sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
        sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    material: ").append(toIndentedString(material)).append("\n");
        sb.append("    minAdPrice: ").append(toIndentedString(minAdPrice)).append("\n");
        sb.append("    mobileLink: ").append(toIndentedString(mobileLink)).append("\n");
        sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
        sb.append("    numberOfRatings: ").append(toIndentedString(numberOfRatings)).append("\n");
        sb.append("    numberOfReviews: ").append(toIndentedString(numberOfReviews)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
        sb.append("    salePriceEffectiveDate: ").append(toIndentedString(salePriceEffectiveDate)).append("\n");
        sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
        sb.append("    shippingHeight: ").append(toIndentedString(shippingHeight)).append("\n");
        sb.append("    shippingWeight: ").append(toIndentedString(shippingWeight)).append("\n");
        sb.append("    shippingWidth: ").append(toIndentedString(shippingWidth)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeSystem: ").append(toIndentedString(sizeSystem)).append("\n");
        sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    unitPricingBaseMeasure: ").append(toIndentedString(unitPricingBaseMeasure)).append("\n");
        sb.append("    unitPricingMeasure: ").append(toIndentedString(unitPricingMeasure)).append("\n");
        sb.append("    variantNames: ").append(toIndentedString(variantNames)).append("\n");
        sb.append("    variantValues: ").append(toIndentedString(variantValues)).append("\n");
        sb.append("    additionalImageLink: ").append(toIndentedString(additionalImageLink)).append("\n");
        sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
        sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
        sb.append("    videoLink: ").append(toIndentedString(videoLink)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

