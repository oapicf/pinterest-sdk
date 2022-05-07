<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedIngestionDetails
{
    /**
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionErrors::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionErrors::class})
     * @var \App\DTO\CatalogsFeedIngestionErrors|null
     */
    public $errors;

    /**
     * @DTA\Data(field="info")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionInfo::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionInfo::class})
     * @var \App\DTO\CatalogsFeedIngestionInfo|null
     */
    public $info;

}
