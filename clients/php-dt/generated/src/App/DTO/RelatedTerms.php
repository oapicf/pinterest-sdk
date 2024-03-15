<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RelatedTerms
{
    /**
     * First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Total number of related terms returned
     * @DTA\Data(field="related_term_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $related_term_count = null;

    /**
     * The id of the advertiser.
     * @DTA\Data(field="related_terms_list", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection158::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection158::class})
     */
    public ?\App\DTO\Collection158 $related_terms_list = null;

}
