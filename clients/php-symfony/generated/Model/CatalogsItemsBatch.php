<?php
/**
 * CatalogsItemsBatch
 *
 * PHP version 7.1.3
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
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the CatalogsItemsBatch model.
 *
 * Object describing the catalogs items batch
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class CatalogsItemsBatch 
{
        /**
     * Array with the catalogs items processing records part of the catalogs items batch
     *
     * @var OpenAPI\Server\Model\ItemProcessingRecord[]|null
     * @SerializedName("items")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\ItemProcessingRecord")
     * })
     * @Type("array<OpenAPI\Server\Model\ItemProcessingRecord>")
     */
    protected $items;

    /**
     * Id of the catalogs items batch
     *
     * @var string|null
     * @SerializedName("batch_id")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $batchId;

    /**
     * Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
     *
     * @var \DateTime|null
     * @SerializedName("created_time")
     * @Assert\DateTime()
     * @Type("DateTime")
     */
    protected $createdTime;

    /**
     * Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
     *
     * @var \DateTime|null
     * @SerializedName("completed_time")
     * @Assert\DateTime()
     * @Type("DateTime")
     */
    protected $completedTime;

    /**
     * @var OpenAPI\Server\Model\BatchOperationStatus|null
     * @SerializedName("status")
     * @Assert\Type("OpenAPI\Server\Model\BatchOperationStatus")
     * @Type("OpenAPI\Server\Model\BatchOperationStatus")
     */
    protected $status;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->items = isset($data['items']) ? $data['items'] : null;
        $this->batchId = isset($data['batchId']) ? $data['batchId'] : null;
        $this->createdTime = isset($data['createdTime']) ? $data['createdTime'] : null;
        $this->completedTime = isset($data['completedTime']) ? $data['completedTime'] : null;
        $this->status = isset($data['status']) ? $data['status'] : null;
    }

    /**
     * Gets items.
     *
     * @return OpenAPI\Server\Model\ItemProcessingRecord[]|null
     */
    public function getItems(): ?array
    {
        return $this->items;
    }

    /**
     * Sets items.
     *
     * @param OpenAPI\Server\Model\ItemProcessingRecord[]|null $items  Array with the catalogs items processing records part of the catalogs items batch
     *
     * @return $this
     */
    public function setItems(array $items = null)
    {
        $this->items = $items;

        return $this;
    }

    /**
     * Gets batchId.
     *
     * @return string|null
     */
    public function getBatchId()
    {
        return $this->batchId;
    }

    /**
     * Sets batchId.
     *
     * @param string|null $batchId  Id of the catalogs items batch
     *
     * @return $this
     */
    public function setBatchId($batchId = null)
    {
        $this->batchId = $batchId;

        return $this;
    }

    /**
     * Gets createdTime.
     *
     * @return \DateTime|null
     */
    public function getCreatedTime(): ?\DateTime
    {
        return $this->createdTime;
    }

    /**
     * Sets createdTime.
     *
     * @param \DateTime|null $createdTime  Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
     *
     * @return $this
     */
    public function setCreatedTime(\DateTime $createdTime = null)
    {
        $this->createdTime = $createdTime;

        return $this;
    }

    /**
     * Gets completedTime.
     *
     * @return \DateTime|null
     */
    public function getCompletedTime(): ?\DateTime
    {
        return $this->completedTime;
    }

    /**
     * Sets completedTime.
     *
     * @param \DateTime|null $completedTime  Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
     *
     * @return $this
     */
    public function setCompletedTime(\DateTime $completedTime = null)
    {
        $this->completedTime = $completedTime;

        return $this;
    }

    /**
     * Gets status.
     *
     * @return OpenAPI\Server\Model\BatchOperationStatus|null
     */
    public function getStatus(): ?BatchOperationStatus
    {
        return $this->status;
    }

    /**
     * Sets status.
     *
     * @param OpenAPI\Server\Model\BatchOperationStatus|null $status
     *
     * @return $this
     */
    public function setStatus(BatchOperationStatus $status = null)
    {
        $this->status = $status;

        return $this;
    }
}

