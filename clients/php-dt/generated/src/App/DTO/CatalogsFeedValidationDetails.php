<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedValidationDetails
{
    /**
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedValidationErrors::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedValidationErrors::class})
     * @var \App\DTO\CatalogsFeedValidationErrors|null
     */
    public $errors;

    /**
     * @DTA\Data(field="warnings")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedValidationWarnings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedValidationWarnings::class})
     * @var \App\DTO\CatalogsFeedValidationWarnings|null
     */
    public $warnings;

}
