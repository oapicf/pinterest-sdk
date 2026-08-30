<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdatableItemAttributes
{
    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_0_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_0_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_0_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_0_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_10_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_10_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_10_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_10_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_11_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_11_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_11_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_11_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_12_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_12_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_12_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_12_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_13_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_13_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_13_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_13_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_14_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_14_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_14_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_14_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_15_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_15_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_15_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_15_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_16_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_16_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_16_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_16_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_17_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_17_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_17_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_17_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_18_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_18_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_18_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_18_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_19_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_19_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_19_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_19_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_1_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_1_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_1_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_1_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_2_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_2_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_2_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_2_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_3_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_3_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_3_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_3_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_4_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_4_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_4_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_4_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_5_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_5_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_5_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_5_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_6_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_6_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_6_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_6_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_7_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_7_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_7_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_7_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_8_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_8_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_8_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_8_tag = null;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_9_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_image_9_link = null;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_9_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_image_9_tag = null;

    /**
     * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
     * @DTA\Data(field="ad_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ad_link = null;

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_video_0_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_video_0_link = null;

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @DTA\Data(field="ad_video_0_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_video_0_tag = null;

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_video_1_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_video_1_link = null;

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @DTA\Data(field="ad_video_1_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_video_1_tag = null;

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_video_2_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $ad_video_2_link = null;

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @DTA\Data(field="ad_video_2_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $ad_video_2_tag = null;

    /**
     * Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.
     * @DTA\Data(field="adult", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $adult = null;

    /**
     * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.
     * @DTA\Data(field="age_group", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $age_group = null;

    /**
     * The deep link to the product on the Android app.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $android_deep_link = null;

    /**
     * The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.
     * @DTA\Data(field="availability", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $availability = null;

    /**
     * Average reviews for the item. Can be a number from 1-5.
     * @DTA\Data(field="average_review_rating", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $average_review_rating = null;

    /**
     * The brand of the product.
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $brand = null;

    /**
     * This attribute is not supported anymore.
     * @DTA\Data(field="checkout_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $checkout_enabled = null;

    /**
     * The primary color of the product.
     * @DTA\Data(field="color", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $color = null;

    /**
     * The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.
     * @DTA\Data(field="condition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $condition = null;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $custom_label_0 = null;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $custom_label_1 = null;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $custom_label_2 = null;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $custom_label_3 = null;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":511})
     */
    public ?string $custom_label_4 = null;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $custom_number_0 = null;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $custom_number_1 = null;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $custom_number_2 = null;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $custom_number_3 = null;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $custom_number_4 = null;

    /**
     * &lt;&#x3D; 10000 characters. The description of the product.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * The item is free to ship.
     * @DTA\Data(field="free_shipping_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $free_shipping_label = null;

    /**
     * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
     * @DTA\Data(field="free_shipping_limit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $free_shipping_limit = null;

    /**
     * The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.
     * @DTA\Data(field="gender", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $gender = null;

    /**
     * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @DTA\Data(field="google_product_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $google_product_category = null;

    /**
     * @DTA\Data(field="gtin", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdatableItemAttributesGtin::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdatableItemAttributesGtin::class})
     */
    public ?\App\DTO\UpdatableItemAttributesGtin $gtin = null;

    /**
     * &lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;
     * @DTA\Data(field="installment_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $installment_price = null;

    /**
     * The deep link to the product on the iOS app.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ios_deep_link = null;

    /**
     * &lt;&#x3D; 127 characters. The parent ID of the product.
     * @DTA\Data(field="item_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_group_id = null;

    /**
     * The millisecond timestamp when the item was lastly modified by the merchant.
     * @DTA\Data(field="last_updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $last_updated_time = null;

    /**
     * &lt;&#x3D; 511 characters. The landing page for the product.
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * The material used to make the product.
     * @DTA\Data(field="material", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $material = null;

    /**
     * The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="min_ad_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $min_ad_price = null;

    /**
     * The mobile-optimized version of your landing page. Must begin with http:// or https://.
     * @DTA\Data(field="mobile_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $mobile_link = null;

    /**
     * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
     * @DTA\Data(field="mpn", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $mpn = null;

    /**
     * The number of ratings for the item.
     * @DTA\Data(field="number_of_ratings", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $number_of_ratings = null;

    /**
     * The number of reviews available for the item.
     * @DTA\Data(field="number_of_reviews", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $number_of_reviews = null;

    /**
     * The description of the pattern used for the product.
     * @DTA\Data(field="pattern", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pattern = null;

    /**
     * The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $price = null;

    /**
     * &lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.
     * @DTA\Data(field="product_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_type = null;

    /**
     * A unique identifier referencing the promotion associated with this catalog item.
     * @DTA\Data(field="promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $promotion_id = null;

    /**
     * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $sale_price = null;

    /**
     * Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)
     * @DTA\Data(field="sale_price_effective_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $sale_price_effective_date = null;

    /**
     * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
     * @DTA\Data(field="shipping", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shipping = null;

    /**
     * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @DTA\Data(field="shipping_height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shipping_height = null;

    /**
     * The weight of the product. Ensure there is a space between the numeric string and the metric.
     * @DTA\Data(field="shipping_weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shipping_weight = null;

    /**
     * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @DTA\Data(field="shipping_width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shipping_width = null;

    /**
     * The size of the product.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $size = null;

    /**
     * Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.
     * @DTA\Data(field="size_system", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $size_system = null;

    /**
     * Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.
     * @DTA\Data(field="size_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $size_type = null;

    /**
     * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
     * @DTA\Data(field="tax", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $tax = null;

    /**
     * &lt;&#x3D; 500 characters. The name of the product.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;
     * @DTA\Data(field="unit_pricing_base_measure", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $unit_pricing_base_measure = null;

    /**
     * Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;
     * @DTA\Data(field="unit_pricing_measure", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $unit_pricing_measure = null;

    /**
     * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
     * @DTA\Data(field="variant_names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $variant_names = null;

    /**
     * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
     * @DTA\Data(field="variant_values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $variant_values = null;

}
