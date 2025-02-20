<?php
/**
 * CatalogsHotelItemsBatch
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
 * Class representing the CatalogsHotelItemsBatch model.
 *
 * Object describing the catalogs hotel items batch
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsHotelItemsBatch 
{
        /**
     * Id of the catalogs items batch
     *
     * @var string|null
     * @SerializedName("batch_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $batchId = null;

    /**
     * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     *
     * @var \DateTime|null
     * @SerializedName("created_time")
     * @Type("DateTime")
    */
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $createdTime = null;

    /**
     * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     *
     * @var \DateTime|null
     * @SerializedName("completed_time")
     * @Type("DateTime")
    */
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $completedTime = null;

    /**
     * @var BatchOperationStatus|null
     * @SerializedName("status")
    * @Accessor(getter="getSerializedStatus", setter="setDeserializedStatus")
    * @Type("string")
    */
    protected ?BatchOperationStatus $status = null;

    /**
     * @var CatalogsType|null
     * @SerializedName("catalog_type")
    * @Accessor(getter="getSerializedCatalogType", setter="setDeserializedCatalogType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?CatalogsType $catalogType = null;

    /**
     * Array with the catalogs items processing records part of the catalogs items batch
     *
     * @var HotelProcessingRecord[]|null
     * @SerializedName("items")
     * @Type("array<OpenAPI\Server\Model\HotelProcessingRecord>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\HotelProcessingRecord"),
    ])]
    protected ?array $items = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->batchId = array_key_exists('batchId', $data) ? $data['batchId'] : $this->batchId;
            $this->createdTime = array_key_exists('createdTime', $data) ? $data['createdTime'] : $this->createdTime;
            $this->completedTime = array_key_exists('completedTime', $data) ? $data['completedTime'] : $this->completedTime;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->catalogType = array_key_exists('catalogType', $data) ? $data['catalogType'] : $this->catalogType;
            $this->items = array_key_exists('items', $data) ? $data['items'] : $this->items;
        }
    }

    /**
     * Gets batchId.
     *
     * @return string|null
     */
    public function getBatchId(): ?string
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
    public function setBatchId(?string $batchId = null): self
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
    * @param \DateTime|null $createdTime  Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
    *
    * @return $this
    */
    public function setCreatedTime(?\DateTime $createdTime = null): self
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
    * @param \DateTime|null $completedTime  Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
    *
    * @return $this
    */
    public function setCompletedTime(?\DateTime $completedTime = null): self
    {
        $this->completedTime = $completedTime;

        return $this;
    }




    /**
     * Gets status.
     *
     * @return BatchOperationStatus|null
     */
    public function getStatus(): ?BatchOperationStatus
    {
        return $this->status;
    }

    /**
    * Sets status.
    *
    * @param BatchOperationStatus|null $status
    *
    * @return $this
    */
    public function setStatus(?BatchOperationStatus $status = null): self
    {
        $this->status = $status;

        return $this;
    }

    /**
    * Gets status for serialization.
    *
    * @return string|null
    */
    public function getSerializedStatus(): string|null
    {
        return !is_null($this->status?->value) ? (string) $this->status->value : null;
    }

    /**
    * Sets status.
    *
    * @param string|BatchOperationStatus|null $status
    *
    * @return $this
    */
    public function setDeserializedStatus(string|BatchOperationStatus|null $status = null): self
    {
        if (is_string($status)) {
            $status = BatchOperationStatus::tryFrom($status);
        }

        $this->status = $status;

        return $this;
    }



    /**
     * Gets catalogType.
     *
     * @return CatalogsType|null
     */
    public function getCatalogType(): ?CatalogsType
    {
        return $this->catalogType;
    }

    /**
    * Sets catalogType.
    *
    * @param CatalogsType|null $catalogType
    *
    * @return $this
    */
    public function setCatalogType(?CatalogsType $catalogType): self
    {
        $this->catalogType = $catalogType;

        return $this;
    }

    /**
    * Gets catalogType for serialization.
    *
    * @return string|null
    */
    public function getSerializedCatalogType(): string|null
    {
        return !is_null($this->catalogType?->value) ? (string) $this->catalogType->value : null;
    }

    /**
    * Sets catalogType.
    *
    * @param string|CatalogsType|null $catalogType
    *
    * @return $this
    */
    public function setDeserializedCatalogType(string|CatalogsType|null $catalogType): self
    {
        if (is_string($catalogType)) {
            $catalogType = CatalogsType::tryFrom($catalogType);
        }

        $this->catalogType = $catalogType;

        return $this;
    }



    /**
     * Gets items.
     *
     * @return HotelProcessingRecord[]|null
     */
    public function getItems(): ?array
    {
        return $this->items;
    }

    /**
    * Sets items.
    *
    * @param HotelProcessingRecord[]|null $items  Array with the catalogs items processing records part of the catalogs items batch
    *
    * @return $this
    */
    public function setItems(?array $items = null): self
    {
        $this->items = $items;

        return $this;
    }



}


