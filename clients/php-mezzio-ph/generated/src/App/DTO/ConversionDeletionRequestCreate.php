<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class ConversionDeletionRequestCreate
{
    /**
     * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
     * @DTA\Data(field="deletion_targets")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionDeletionRequestTargets::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionDeletionRequestTargets::class})
     * @var \App\DTO\ConversionDeletionRequestTargets|null
     */
    public $deletion_targets;

}
