<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsFeedIngestionDetails
{
    /**
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionErrors::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionErrors::class})
     */
    public ?\App\DTO\CatalogsFeedIngestionErrors $errors = null;

    /**
     * @DTA\Data(field="info")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionInfo::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionInfo::class})
     */
    public ?\App\DTO\CatalogsFeedIngestionInfo $info = null;

    /**
     * @DTA\Data(field="warnings")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionWarnings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionWarnings::class})
     */
    public ?\App\DTO\CatalogsFeedIngestionWarnings $warnings = null;

}
