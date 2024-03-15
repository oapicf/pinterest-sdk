<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for targeting_options/get
 */
class TargetingOptionsGetQueryData
{
    /**
     * Oauth signature
     * @DTA\Data(field="oauth_signature", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $oauth_signature;

    /**
     * Client ID.
     * @DTA\Data(field="client_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $client_id;

    /**
     * Timestamp
     * @DTA\Data(field="timestamp", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/\\d+/"})
     * @var string|null
     */
    public $timestamp;

}
