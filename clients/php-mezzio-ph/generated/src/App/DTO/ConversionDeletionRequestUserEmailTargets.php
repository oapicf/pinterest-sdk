<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionDeletionRequestUserEmailTargets
{
    /**
     * Array of plain text user emails.
     * @DTA\Data(field="user_emails")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $user_emails;

}
