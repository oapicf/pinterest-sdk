<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CampaignAdPreviewDelete200ResponseInnerStatus
{
    /**
     * @DTA\Data(field="statusCode")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $status_code;

    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $code;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
