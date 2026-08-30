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
     * HTTP request host from host header.
     * @DTA\Data(field="host")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $host = null;

    /**
     * @DTA\Data(field="method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HttpMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\HttpMethod::class})
     */
    public ?\App\DTO\HttpMethod $method = null;

    /**
     * HTTP request path.
     * @DTA\Data(field="path")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $path = null;

    /**
     * HTTP request headers as key-value pairs.
     * @DTA\Data(field="request_headers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection432::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection432::class})
     */
    public ?\App\DTO\Collection432 $request_headers = null;

    /**
     * HTTP response headers as key-value pairs.
     * @DTA\Data(field="response_headers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection433::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection433::class})
     */
    public ?\App\DTO\Collection433 $response_headers = null;

    /**
     * @DTA\Data(field="response_status_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $response_status_code = null;

}
