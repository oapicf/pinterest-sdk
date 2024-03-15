<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RelatedTermsRelatedTermsListInner
{
    /**
     * @DTA\Data(field="term", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $term = null;

    /**
     * @DTA\Data(field="related_terms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection157::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection157::class})
     */
    public ?\App\DTO\Collection157 $related_terms = null;

}
