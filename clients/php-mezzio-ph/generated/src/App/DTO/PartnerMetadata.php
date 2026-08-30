<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PartnerMetadata
{
    /**
     * Text field value that uniquely identifies a subscriber.
     * @DTA\Data(field="subscriber_key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $subscriber_key;

}
