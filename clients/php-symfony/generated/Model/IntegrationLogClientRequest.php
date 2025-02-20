<?php
/**
 * IntegrationLogClientRequest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the IntegrationLogClientRequest model.
 *
 * HTTP request details included in the log sent by the client.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class IntegrationLogClientRequest 
{
        /**
     * @var string|null
     * @SerializedName("method")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH"])]
    #[Assert\Type("string")]
    protected ?string $method = null;

    /**
     * HTTP request host from host header.
     *
     * @var string|null
     * @SerializedName("host")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $host = null;

    /**
     * HTTP request path.
     *
     * @var string|null
     * @SerializedName("path")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $path = null;

    /**
     * HTTP request headers as key-value pairs.
     *
     * @var string[]|null
     * @SerializedName("request_headers")
     * @Type("array<string, string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $requestHeaders = null;

    /**
     * HTTP response headers as key-value pairs.
     *
     * @var string[]|null
     * @SerializedName("response_headers")
     * @Type("array<string, string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $responseHeaders = null;

    /**
     * @var int|null
     * @SerializedName("response_status_code")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $responseStatusCode = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->method = array_key_exists('method', $data) ? $data['method'] : $this->method;
            $this->host = array_key_exists('host', $data) ? $data['host'] : $this->host;
            $this->path = array_key_exists('path', $data) ? $data['path'] : $this->path;
            $this->requestHeaders = array_key_exists('requestHeaders', $data) ? $data['requestHeaders'] : $this->requestHeaders;
            $this->responseHeaders = array_key_exists('responseHeaders', $data) ? $data['responseHeaders'] : $this->responseHeaders;
            $this->responseStatusCode = array_key_exists('responseStatusCode', $data) ? $data['responseStatusCode'] : $this->responseStatusCode;
        }
    }

    /**
     * Gets method.
     *
     * @return string|null
     */
    public function getMethod(): ?string
    {
        return $this->method;
    }

    /**
    * Sets method.
    *
    * @param string|null $method
    *
    * @return $this
    */
    public function setMethod(?string $method): self
    {
        $this->method = $method;

        return $this;
    }




    /**
     * Gets host.
     *
     * @return string|null
     */
    public function getHost(): ?string
    {
        return $this->host;
    }

    /**
    * Sets host.
    *
    * @param string|null $host  HTTP request host from host header.
    *
    * @return $this
    */
    public function setHost(?string $host): self
    {
        $this->host = $host;

        return $this;
    }




    /**
     * Gets path.
     *
     * @return string|null
     */
    public function getPath(): ?string
    {
        return $this->path;
    }

    /**
    * Sets path.
    *
    * @param string|null $path  HTTP request path.
    *
    * @return $this
    */
    public function setPath(?string $path): self
    {
        $this->path = $path;

        return $this;
    }




    /**
     * Gets requestHeaders.
     *
     * @return string[]|null
     */
    public function getRequestHeaders(): ?array
    {
        return $this->requestHeaders;
    }

    /**
    * Sets requestHeaders.
    *
    * @param string[]|null $requestHeaders  HTTP request headers as key-value pairs.
    *
    * @return $this
    */
    public function setRequestHeaders(?array $requestHeaders = null): self
    {
        $this->requestHeaders = $requestHeaders;

        return $this;
    }




    /**
     * Gets responseHeaders.
     *
     * @return string[]|null
     */
    public function getResponseHeaders(): ?array
    {
        return $this->responseHeaders;
    }

    /**
    * Sets responseHeaders.
    *
    * @param string[]|null $responseHeaders  HTTP response headers as key-value pairs.
    *
    * @return $this
    */
    public function setResponseHeaders(?array $responseHeaders = null): self
    {
        $this->responseHeaders = $responseHeaders;

        return $this;
    }




    /**
     * Gets responseStatusCode.
     *
     * @return int|null
     */
    public function getResponseStatusCode(): ?int
    {
        return $this->responseStatusCode;
    }

    /**
    * Sets responseStatusCode.
    *
    * @param int|null $responseStatusCode
    *
    * @return $this
    */
    public function setResponseStatusCode(?int $responseStatusCode = null): self
    {
        $this->responseStatusCode = $responseStatusCode;

        return $this;
    }



}


