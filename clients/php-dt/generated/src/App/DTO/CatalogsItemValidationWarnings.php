<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsItemValidationWarnings
{
    /**
     * ad_image_0_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_0_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_link_duplicated = null;

    /**
     * Ad image link 0 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_0_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_link_length_too_long = null;

    /**
     * Ad image link 0 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_0_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_link_required = null;

    /**
     * Ad image link 0 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_0_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_link_warning = null;

    /**
     * ad_image_0_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_0_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_tag_duplicated = null;

    /**
     * Ad image tag 0 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_0_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_tag_length_too_long = null;

    /**
     * Ad image tag 0 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_0_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_0_tag_required = null;

    /**
     * ad_image_10_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_10_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_link_duplicated = null;

    /**
     * Ad image link 10 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_10_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_link_length_too_long = null;

    /**
     * Ad image link 10 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_10_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_link_required = null;

    /**
     * Ad image link 10 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_10_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_link_warning = null;

    /**
     * ad_image_10_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_10_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_tag_duplicated = null;

    /**
     * Ad image tag 10 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_10_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_tag_length_too_long = null;

    /**
     * Ad image tag 10 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_10_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_10_tag_required = null;

    /**
     * ad_image_11_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_11_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_link_duplicated = null;

    /**
     * Ad image link 11 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_11_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_link_length_too_long = null;

    /**
     * Ad image link 11 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_11_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_link_required = null;

    /**
     * Ad image link 11 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_11_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_link_warning = null;

    /**
     * ad_image_11_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_11_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_tag_duplicated = null;

    /**
     * Ad image tag 11 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_11_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_tag_length_too_long = null;

    /**
     * Ad image tag 11 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_11_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_11_tag_required = null;

    /**
     * ad_image_12_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_12_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_link_duplicated = null;

    /**
     * Ad image link 12 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_12_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_link_length_too_long = null;

    /**
     * Ad image link 12 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_12_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_link_required = null;

    /**
     * Ad image link 12 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_12_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_link_warning = null;

    /**
     * ad_image_12_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_12_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_tag_duplicated = null;

    /**
     * Ad image tag 12 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_12_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_tag_length_too_long = null;

    /**
     * Ad image tag 12 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_12_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_12_tag_required = null;

    /**
     * ad_image_13_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_13_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_link_duplicated = null;

    /**
     * Ad image link 13 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_13_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_link_length_too_long = null;

    /**
     * Ad image link 13 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_13_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_link_required = null;

    /**
     * Ad image link 13 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_13_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_link_warning = null;

    /**
     * ad_image_13_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_13_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_tag_duplicated = null;

    /**
     * Ad image tag 13 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_13_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_tag_length_too_long = null;

    /**
     * Ad image tag 13 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_13_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_13_tag_required = null;

    /**
     * ad_image_14_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_14_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_link_duplicated = null;

    /**
     * Ad image link 14 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_14_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_link_length_too_long = null;

    /**
     * Ad image link 14 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_14_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_link_required = null;

    /**
     * Ad image link 14 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_14_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_link_warning = null;

    /**
     * ad_image_14_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_14_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_tag_duplicated = null;

    /**
     * Ad image tag 14 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_14_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_tag_length_too_long = null;

    /**
     * Ad image tag 14 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_14_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_14_tag_required = null;

    /**
     * ad_image_15_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_15_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_link_duplicated = null;

    /**
     * Ad image link 15 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_15_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_link_length_too_long = null;

    /**
     * Ad image link 15 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_15_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_link_required = null;

    /**
     * Ad image link 15 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_15_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_link_warning = null;

    /**
     * ad_image_15_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_15_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_tag_duplicated = null;

    /**
     * Ad image tag 15 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_15_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_tag_length_too_long = null;

    /**
     * Ad image tag 15 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_15_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_15_tag_required = null;

    /**
     * ad_image_16_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_16_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_link_duplicated = null;

    /**
     * Ad image link 16 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_16_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_link_length_too_long = null;

    /**
     * Ad image link 16 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_16_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_link_required = null;

    /**
     * Ad image link 16 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_16_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_link_warning = null;

    /**
     * ad_image_16_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_16_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_tag_duplicated = null;

    /**
     * Ad image tag 16 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_16_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_tag_length_too_long = null;

    /**
     * Ad image tag 16 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_16_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_16_tag_required = null;

    /**
     * ad_image_17_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_17_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_link_duplicated = null;

    /**
     * Ad image link 17 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_17_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_link_length_too_long = null;

    /**
     * Ad image link 17 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_17_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_link_required = null;

    /**
     * Ad image link 17 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_17_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_link_warning = null;

    /**
     * ad_image_17_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_17_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_tag_duplicated = null;

    /**
     * Ad image tag 17 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_17_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_tag_length_too_long = null;

    /**
     * Ad image tag 17 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_17_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_17_tag_required = null;

    /**
     * ad_image_18_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_18_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_link_duplicated = null;

    /**
     * Ad image link 18 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_18_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_link_length_too_long = null;

    /**
     * Ad image link 18 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_18_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_link_required = null;

    /**
     * Ad image link 18 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_18_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_link_warning = null;

    /**
     * ad_image_18_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_18_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_tag_duplicated = null;

    /**
     * Ad image tag 18 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_18_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_tag_length_too_long = null;

    /**
     * Ad image tag 18 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_18_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_18_tag_required = null;

    /**
     * ad_image_19_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_19_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_link_duplicated = null;

    /**
     * Ad image link 19 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_19_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_link_length_too_long = null;

    /**
     * Ad image link 19 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_19_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_link_required = null;

    /**
     * Ad image link 19 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_19_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_link_warning = null;

    /**
     * ad_image_19_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_19_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_tag_duplicated = null;

    /**
     * Ad image tag 19 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_19_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_tag_length_too_long = null;

    /**
     * Ad image tag 19 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_19_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_19_tag_required = null;

    /**
     * ad_image_1_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_1_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_link_duplicated = null;

    /**
     * Ad image link 1 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_1_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_link_length_too_long = null;

    /**
     * Ad image link 1 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_1_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_link_required = null;

    /**
     * Ad image link 1 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_1_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_link_warning = null;

    /**
     * ad_image_1_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_1_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_tag_duplicated = null;

    /**
     * Ad image tag 1 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_1_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_tag_length_too_long = null;

    /**
     * Ad image tag 1 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_1_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_1_tag_required = null;

    /**
     * ad_image_2_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_2_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_link_duplicated = null;

    /**
     * Ad image link 2 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_2_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_link_length_too_long = null;

    /**
     * Ad image link 2 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_2_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_link_required = null;

    /**
     * Ad image link 2 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_2_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_link_warning = null;

    /**
     * ad_image_2_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_2_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_tag_duplicated = null;

    /**
     * Ad image tag 2 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_2_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_tag_length_too_long = null;

    /**
     * Ad image tag 2 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_2_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_2_tag_required = null;

    /**
     * ad_image_3_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_3_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_link_duplicated = null;

    /**
     * Ad image link 3 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_3_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_link_length_too_long = null;

    /**
     * Ad image link 3 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_3_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_link_required = null;

    /**
     * Ad image link 3 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_3_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_link_warning = null;

    /**
     * ad_image_3_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_3_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_tag_duplicated = null;

    /**
     * Ad image tag 3 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_3_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_tag_length_too_long = null;

    /**
     * Ad image tag 3 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_3_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_3_tag_required = null;

    /**
     * ad_image_4_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_4_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_link_duplicated = null;

    /**
     * Ad image link 4 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_4_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_link_length_too_long = null;

    /**
     * Ad image link 4 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_4_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_link_required = null;

    /**
     * Ad image link 4 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_4_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_link_warning = null;

    /**
     * ad_image_4_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_4_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_tag_duplicated = null;

    /**
     * Ad image tag 4 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_4_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_tag_length_too_long = null;

    /**
     * Ad image tag 4 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_4_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_4_tag_required = null;

    /**
     * ad_image_5_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_5_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_link_duplicated = null;

    /**
     * Ad image link 5 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_5_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_link_length_too_long = null;

    /**
     * Ad image link 5 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_5_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_link_required = null;

    /**
     * Ad image link 5 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_5_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_link_warning = null;

    /**
     * ad_image_5_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_5_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_tag_duplicated = null;

    /**
     * Ad image tag 5 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_5_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_tag_length_too_long = null;

    /**
     * Ad image tag 5 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_5_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_5_tag_required = null;

    /**
     * ad_image_6_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_6_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_link_duplicated = null;

    /**
     * Ad image link 6 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_6_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_link_length_too_long = null;

    /**
     * Ad image link 6 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_6_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_link_required = null;

    /**
     * Ad image link 6 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_6_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_link_warning = null;

    /**
     * ad_image_6_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_6_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_tag_duplicated = null;

    /**
     * Ad image tag 6 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_6_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_tag_length_too_long = null;

    /**
     * Ad image tag 6 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_6_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_6_tag_required = null;

    /**
     * ad_image_7_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_7_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_link_duplicated = null;

    /**
     * Ad image link 7 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_7_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_link_length_too_long = null;

    /**
     * Ad image link 7 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_7_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_link_required = null;

    /**
     * Ad image link 7 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_7_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_link_warning = null;

    /**
     * ad_image_7_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_7_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_tag_duplicated = null;

    /**
     * Ad image tag 7 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_7_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_tag_length_too_long = null;

    /**
     * Ad image tag 7 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_7_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_7_tag_required = null;

    /**
     * ad_image_8_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_8_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_link_duplicated = null;

    /**
     * Ad image link 8 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_8_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_link_length_too_long = null;

    /**
     * Ad image link 8 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_8_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_link_required = null;

    /**
     * Ad image link 8 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_8_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_link_warning = null;

    /**
     * ad_image_8_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_8_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_tag_duplicated = null;

    /**
     * Ad image tag 8 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_8_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_tag_length_too_long = null;

    /**
     * Ad image tag 8 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_8_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_8_tag_required = null;

    /**
     * ad_image_9_link is duplicated with another ad image link.
     * @DTA\Data(field="AD_IMAGE_9_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_link_duplicated = null;

    /**
     * Ad image link 9 length is too long. The maximum length is 2047 characters.
     * @DTA\Data(field="AD_IMAGE_9_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_link_length_too_long = null;

    /**
     * Ad image link 9 is required because an image tag was provided.
     * @DTA\Data(field="AD_IMAGE_9_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_link_required = null;

    /**
     * Ad image link 9 format is unsupported.
     * @DTA\Data(field="AD_IMAGE_9_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_link_warning = null;

    /**
     * ad_image_9_tag is duplicated with another ad image tag.
     * @DTA\Data(field="AD_IMAGE_9_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_tag_duplicated = null;

    /**
     * Ad image tag 9 length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_IMAGE_9_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_tag_length_too_long = null;

    /**
     * Ad image tag 9 is required because an image link was provided.
     * @DTA\Data(field="AD_IMAGE_9_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_image_9_tag_required = null;

    /**
     * Item has an ad link that is formatted incorrectly.
     * @DTA\Data(field="AD_LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_link_format_warning = null;

    /**
     * Item has an ad link URL that is duplicate of the link URL.
     * @DTA\Data(field="AD_LINK_SAME_AS_LINK", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_link_same_as_link = null;

    /**
     * ad_video_0_link is duplicated with another ad video link.
     * @DTA\Data(field="AD_VIDEO_0_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_link_duplicated = null;

    /**
     * ad_video_0_link length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_VIDEO_0_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_link_length_too_long = null;

    /**
     * ad_video_0_link is required for this item because ad_video_0_tag was provided.
     * @DTA\Data(field="AD_VIDEO_0_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_link_required = null;

    /**
     * ad_video_0_link is formatted incorrectly and will not be published with your items.
     * @DTA\Data(field="AD_VIDEO_0_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_link_warning = null;

    /**
     * ad_video_0_tag is duplicated with another ad video tag.
     * @DTA\Data(field="AD_VIDEO_0_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_tag_duplicated = null;

    /**
     * ad_video_0_tag length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_VIDEO_0_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_tag_length_too_long = null;

    /**
     * ad_video_0_tag is required because ad_video_0_link was provided.
     * @DTA\Data(field="AD_VIDEO_0_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_0_tag_required = null;

    /**
     * ad_video_1_link is duplicated with another ad video link.
     * @DTA\Data(field="AD_VIDEO_1_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_link_duplicated = null;

    /**
     * ad_video_1_link length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_VIDEO_1_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_link_length_too_long = null;

    /**
     * ad_video_1_link is required for this item because ad_video_1_tag was provided.
     * @DTA\Data(field="AD_VIDEO_1_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_link_required = null;

    /**
     * ad_video_1_link is formatted incorrectly and will not be published with your items.
     * @DTA\Data(field="AD_VIDEO_1_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_link_warning = null;

    /**
     * ad_video_1_tag is duplicated with another ad video tag.
     * @DTA\Data(field="AD_VIDEO_1_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_tag_duplicated = null;

    /**
     * ad_video_1_tag length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_VIDEO_1_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_tag_length_too_long = null;

    /**
     * ad_video_1_tag is required because ad_video_1_link was provided.
     * @DTA\Data(field="AD_VIDEO_1_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_1_tag_required = null;

    /**
     * ad_video_2_link is duplicated with another ad video link.
     * @DTA\Data(field="AD_VIDEO_2_LINK_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_link_duplicated = null;

    /**
     * ad_video_2_link length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_VIDEO_2_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_link_length_too_long = null;

    /**
     * ad_video_2_link is required for this item because ad_video_2_tag was provided.
     * @DTA\Data(field="AD_VIDEO_2_LINK_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_link_required = null;

    /**
     * ad_video_2_link is formatted incorrectly and will not be published with your items.
     * @DTA\Data(field="AD_VIDEO_2_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_link_warning = null;

    /**
     * ad_video_2_tag is duplicated with another ad video tag.
     * @DTA\Data(field="AD_VIDEO_2_TAG_DUPLICATED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_tag_duplicated = null;

    /**
     * ad_video_2_tag length is too long. The maximum length is 511 characters.
     * @DTA\Data(field="AD_VIDEO_2_TAG_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_tag_length_too_long = null;

    /**
     * ad_video_2_tag is required because ad_video_2_link was provided.
     * @DTA\Data(field="AD_VIDEO_2_TAG_REQUIRED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_video_2_tag_required = null;

    /**
     * Item has an additional_image_link URL that contains too many characters, so the item will not be published.
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $additional_image_link_length_too_long = null;

    /**
     * Item has additional_image_link URLs that are formatted incorrectly and will not be published with your items.
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $additional_image_link_warning = null;

    /**
     * Item has an adwords_redirect link that is formatted incorrectly.
     * @DTA\Data(field="ADWORDS_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adwords_format_warning = null;

    /**
     * Item has an adwords_redirect URL that is duplicate of the link URL.
     * @DTA\Data(field="ADWORDS_SAME_AS_LINK", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adwords_same_as_link = null;

    /**
     * Item has an age group value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="AGE_GROUP_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $age_group_invalid = null;

    /**
     * Item includes an invalid android_deep_link.
     * @DTA\Data(field="ANDROID_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $android_deep_link_invalid = null;

    /**
     * Item has an availability_date value that is formatted incorrectly, this item will be published without an availability date.
     * @DTA\Data(field="AVAILABILITY_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $availability_date_invalid = null;

    /**
     * Item includes a currency that doesn&#39;t match the usual currency for the location where the product is sold or shipped.
     * @DTA\Data(field="COUNTRY_DOES_NOT_MAP_TO_CURRENCY", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $country_does_not_map_to_currency = null;

    /**
     * Item has a custom_label value that is too long, this item will be published without that custom label.
     * @DTA\Data(field="CUSTOM_LABEL_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $custom_label_length_too_long = null;

    /**
     * The description for this item was truncated because it contains too many characters.
     * @DTA\Data(field="DESCRIPTION_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $description_length_too_long = null;

    /**
     * Item has an expiration_date value that is formatted incorrectly, this item will be published without an expiration date.
     * @DTA\Data(field="EXPIRATION_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $expiration_date_invalid = null;

    /**
     * Item has a gender value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="GENDER_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $gender_invalid = null;

    /**
     * Item has a GTIN value that is formatted incorrectly.
     * @DTA\Data(field="GTIN_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $gtin_invalid = null;

    /**
     * Item has an image_link URL that is formatted incorrectly and will not be published.
     * @DTA\Data(field="IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_warning = null;

    /**
     * Item includes an invalid ios_deep_link value.
     * @DTA\Data(field="IOS_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ios_deep_link_invalid = null;

    /**
     * Item has an is_bundle value that is formatted incorrectly, this item will be published without being bundled with other products.
     * @DTA\Data(field="IS_BUNDLE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $is_bundle_invalid = null;

    /**
     * Item includes additional_image_links that can&#39;t be found.
     * @DTA\Data(field="ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $item_additional_image_download_failure = null;

    /**
     * Item has an invalid product link which contains invalid UTM tracking paramaters.
     * @DTA\Data(field="LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $link_format_warning = null;

    /**
     * Item includes a min_ad_price value that is formatted incorrectly.
     * @DTA\Data(field="MIN_AD_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $min_ad_price_invalid = null;

    /**
     * Item has a MPN value that is formatted incorrectly.
     * @DTA\Data(field="MPN_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $mpn_invalid = null;

    /**
     * Item has an invalid multipack value.
     * @DTA\Data(field="MULTIPACK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $multipack_invalid = null;

    /**
     * Item includes a condition value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="OPTIONAL_CONDITION_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_condition_invalid = null;

    /**
     * Item is missing condition value, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="OPTIONAL_CONDITION_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_condition_missing = null;

    /**
     * Item includes a google_product_category value that is not formatted correctly according to the GPC taxonomy.
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_product_category_invalid = null;

    /**
     * Item is missing google_product_category.
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_product_category_missing = null;

    /**
     * Item only has 1 or 2 levels of google_product_category value, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="PRODUCT_CATEGORY_DEPTH_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_category_depth_warning = null;

    /**
     * Item has a product_type value that is too long, this item will be published without that product type.
     * @DTA\Data(field="PRODUCT_TYPE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_type_length_too_long = null;

    /**
     * Item has a sale_price_effective_date value that is formatted incorrectly, this item will be published without a sale date.
     * @DTA\Data(field="SALE_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sale_date_invalid = null;

    /**
     * Item has an incorrectly formatted sales price.
     * @DTA\Data(field="SALES_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sales_price_invalid = null;

    /**
     * Item has a sale price value that is higher than the original price of the item.
     * @DTA\Data(field="SALES_PRICE_TOO_HIGH", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sales_price_too_high = null;

    /**
     * Item has a sale price value that is discounted very low compared to the price.
     * @DTA\Data(field="SALES_PRICE_TOO_LOW", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sales_price_too_low = null;

    /**
     * Item has an incorrectly formatted shipping_height value. The value must first contain a numeric value then a valid dimension unit type.
     * @DTA\Data(field="SHIPPING_HEIGHT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_height_invalid = null;

    /**
     * Item has a shipping value that is formatted incorrectly.
     * @DTA\Data(field="SHIPPING_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_invalid = null;

    /**
     * Item has an invalid shipping_weight value.
     * @DTA\Data(field="SHIPPING_WEIGHT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_weight_invalid = null;

    /**
     * Item has an incorrectly formatted shipping_width value. The value must first contain a numeric value then a valid dimension unit type.
     * @DTA\Data(field="SHIPPING_WIDTH_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_width_invalid = null;

    /**
     * Some items have size system values which are not one of the supported size systems.
     * @DTA\Data(field="SIZE_SYSTEM_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $size_system_invalid = null;

    /**
     * Item has a size type value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="SIZE_TYPE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $size_type_invalid = null;

    /**
     * Item has a tax value that is formatted incorrectly.
     * @DTA\Data(field="TAX_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $tax_invalid = null;

    /**
     * The title for the item was truncated because it contains too many characters.
     * @DTA\Data(field="TITLE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $title_length_too_long = null;

    /**
     * Item has a additional_image_link value that exceed the limit for additional images, this item will be published without some of your images.
     * @DTA\Data(field="TOO_MANY_ADDITIONAL_IMAGE_LINKS", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $too_many_additional_image_links = null;

    /**
     * Item includes an utm_source value that is formatted incorrectly and has been automatically corrected.
     * @DTA\Data(field="UTM_SOURCE_AUTO_CORRECTED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $utm_source_auto_corrected = null;

    /**
     * A video is required in the item when ad_video fields are provided.
     * @DTA\Data(field="VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $video_required_when_ad_video_provided = null;

    /**
     * Item has a weight_unit value that is formatted incorrectly, this item will be published without a weight unit.
     * @DTA\Data(field="WEIGHT_UNIT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $weight_unit_invalid = null;

}
