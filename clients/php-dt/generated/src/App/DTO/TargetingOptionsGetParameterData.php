<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for targeting_options/get
 */
class TargetingOptionsGetParameterData
{
    /**
     * Oauth signature
     * @DTA\Data(subset="query", field="oauth_signature", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $oauth_signature = null;

    /**
     * Public targeting type.
     * @DTA\Data(subset="path", field="targeting_type")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $targeting_type = null;

    /**
     * Client ID.
     * @DTA\Data(subset="query", field="client_id", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Length", options={"max":18})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $client_id = null;

    /**
     * Timestamp
     * @DTA\Data(subset="query", field="timestamp", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/\d+/"})
     */
    public ?string $timestamp = null;

}
