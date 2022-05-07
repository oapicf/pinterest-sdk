<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedIngestionErrors
{
    /**
     * @DTA\Data(field="image_download_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_download_error;

    /**
     * @DTA\Data(field="image_download_connection_timeout", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_download_connection_timeout;

    /**
     * @DTA\Data(field="image_format_unrecognize", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_format_unrecognize;

    /**
     * @DTA\Data(field="line_level_internal_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $line_level_internal_error;

    /**
     * @DTA\Data(field="large_product_count_decrease", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $large_product_count_decrease;

}
