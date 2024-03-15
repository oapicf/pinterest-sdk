<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedIngestionErrors
{
    /**
     * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
     * @DTA\Data(field="LINE_LEVEL_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $line_level_internal_error;

    /**
     * The product count has decreased by more than 99% compared to the last successful ingestion.
     * @DTA\Data(field="LARGE_PRODUCT_COUNT_DECREASE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $large_product_count_decrease;

    /**
     * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
     * @DTA\Data(field="ACCOUNT_FLAGGED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $account_flagged;

    /**
     * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
     * @DTA\Data(field="IMAGE_LEVEL_INTERNAL_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_level_internal_error;

    /**
     * Image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="IMAGE_FILE_NOT_ACCESSIBLE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_file_not_accessible;

    /**
     * Image files are unreadable. Please check your link and upload new files to continue.
     * @DTA\Data(field="IMAGE_MALFORMED_URL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_malformed_url;

    /**
     * Image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="IMAGE_FILE_NOT_FOUND", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_file_not_found;

    /**
     * Image files are unreadable. Please upload new files to continue.
     * @DTA\Data(field="IMAGE_INVALID_FILE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_invalid_file;

}
