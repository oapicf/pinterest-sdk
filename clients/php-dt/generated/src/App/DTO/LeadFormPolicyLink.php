<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadFormPolicyLink
{
    /**
     * Policy label for an additional policy link.
     * @DTA\Data(field="label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $label = null;

    /**
     * Policy link for an additional policy link.
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

}
