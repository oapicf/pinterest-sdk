<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RelatedTermsRelatedTermsListItems
{
    /**
     * @DTA\Data(field="related_terms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection459::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection459::class})
     */
    public ?\App\DTO\Collection459 $related_terms = null;

    /**
     * @DTA\Data(field="term", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $term = null;

}
