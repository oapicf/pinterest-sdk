<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdatableItemAttributes
{
    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_0_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_0_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_0_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_0_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_10_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_10_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_10_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_10_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_11_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_11_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_11_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_11_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_12_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_12_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_12_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_12_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_13_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_13_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_13_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_13_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_14_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_14_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_14_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_14_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_15_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_15_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_15_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_15_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_16_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_16_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_16_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_16_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_17_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_17_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_17_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_17_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_18_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_18_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_18_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_18_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_19_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_19_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_19_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_19_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_1_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_1_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_1_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_1_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_2_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_2_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_2_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_2_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_3_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_3_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_3_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_3_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_4_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_4_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_4_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_4_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_5_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_5_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_5_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_5_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_6_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_6_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_6_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_6_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_7_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_7_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_7_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_7_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_8_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_8_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_8_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_8_tag;

    /**
     * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_image_9_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_image_9_link;

    /**
     * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
     * @DTA\Data(field="ad_image_9_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_image_9_tag;

    /**
     * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
     * @DTA\Data(field="ad_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_link;

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_video_0_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_video_0_link;

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @DTA\Data(field="ad_video_0_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_video_0_tag;

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_video_1_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_video_1_link;

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @DTA\Data(field="ad_video_1_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_video_1_tag;

    /**
     * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
     * @DTA\Data(field="ad_video_2_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $ad_video_2_link;

    /**
     * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
     * @DTA\Data(field="ad_video_2_tag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $ad_video_2_tag;

    /**
     * Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.
     * @DTA\Data(field="adult", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $adult;

    /**
     * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.
     * @DTA\Data(field="age_group", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $age_group;

    /**
     * The deep link to the product on the Android app.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $android_deep_link;

    /**
     * The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.
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
     * The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.
     * @DTA\Data(field="condition", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $condition;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $custom_label_0;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $custom_label_1;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $custom_label_2;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $custom_label_3;

    /**
     * &lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":511})
     * @var string|null
     */
    public $custom_label_4;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_number_0;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_number_1;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_number_2;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_number_3;

    /**
     * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
     * @DTA\Data(field="custom_number_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_number_4;

    /**
     * &lt;&#x3D; 10000 characters. The description of the product.
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
     * The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.
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
     * @DTA\Data(field="gtin", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdatableItemAttributesGtin::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdatableItemAttributesGtin::class})
     * @var \App\DTO\UpdatableItemAttributesGtin|null
     */
    public $gtin;

    /**
     * &lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;
     * @DTA\Data(field="installment_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $installment_price;

    /**
     * The deep link to the product on the iOS app.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ios_deep_link;

    /**
     * &lt;&#x3D; 127 characters. The parent ID of the product.
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
     * &lt;&#x3D; 511 characters. The landing page for the product.
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
     * The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
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
     * The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $price;

    /**
     * &lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.
     * @DTA\Data(field="product_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_type;

    /**
     * A unique identifier referencing the promotion associated with this catalog item.
     * @DTA\Data(field="promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promotion_id;

    /**
     * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $sale_price;

    /**
     * Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)
     * @DTA\Data(field="sale_price_effective_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $sale_price_effective_date;

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
     * Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.
     * @DTA\Data(field="size_system", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $size_system;

    /**
     * Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.
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
     * &lt;&#x3D; 500 characters. The name of the product.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;
     * @DTA\Data(field="unit_pricing_base_measure", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $unit_pricing_base_measure;

    /**
     * Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;
     * @DTA\Data(field="unit_pricing_measure", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $unit_pricing_measure;

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
