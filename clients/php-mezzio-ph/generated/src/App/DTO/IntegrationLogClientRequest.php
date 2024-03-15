<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * HTTP request details included in the log sent by the client.
 */
class IntegrationLogClientRequest
{
    /**
     * @DTA\Data(field="method")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $method;

    /**
     * HTTP request host from host header.
     * @DTA\Data(field="host")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $host;

    /**
     * HTTP request path.
     * @DTA\Data(field="path")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $path;

    /**
     * HTTP request headers as key-value pairs.
     * @DTA\Data(field="request_headers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection141::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection141::class})
     * @var \App\DTO\Collection141|null
     */
    public $request_headers;

    /**
     * HTTP response headers as key-value pairs.
     * @DTA\Data(field="response_headers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection142::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection142::class})
     * @var \App\DTO\Collection142|null
     */
    public $response_headers;

    /**
     * @DTA\Data(field="response_status_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $response_status_code;

}
