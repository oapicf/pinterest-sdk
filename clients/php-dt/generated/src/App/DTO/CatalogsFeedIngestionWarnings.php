<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsFeedIngestionWarnings
{
    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $additional_image_level_internal_error = null;

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $additional_image_file_not_accessible = null;

    /**
     * Additional image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_MALFORMED_URL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $additional_image_malformed_url = null;

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_FILE_NOT_FOUND", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $additional_image_file_not_found = null;

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="ADDITIONAL_IMAGE_INVALID_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $additional_image_invalid_file = null;

    /**
     * price is not a supported column. Use base_price and sale_price instead.
     * @DTA\Data(field="HOTEL_PRICE_HEADER_IS_PRESENT", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $hotel_price_header_is_present = null;

}
