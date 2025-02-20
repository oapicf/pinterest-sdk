<?php
/**
 * CustomLabel1Filter
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
 * Class representing the CustomLabel1Filter model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CustomLabel1Filter 
{
        /**
     * @var CatalogsProductGroupMultipleStringCriteria|null
     * @SerializedName("CUSTOM_LABEL_1")
     * @Type("OpenAPI\Server\Model\CatalogsProductGroupMultipleStringCriteria")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupMultipleStringCriteria")]
    protected ?CatalogsProductGroupMultipleStringCriteria $cUSTOMLABEL1 = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->cUSTOMLABEL1 = array_key_exists('cUSTOMLABEL1', $data) ? $data['cUSTOMLABEL1'] : $this->cUSTOMLABEL1;
        }
    }

    /**
     * Gets cUSTOMLABEL1.
     *
     * @return CatalogsProductGroupMultipleStringCriteria|null
     */
    public function getCUSTOMLABEL1(): ?CatalogsProductGroupMultipleStringCriteria
    {
        return $this->cUSTOMLABEL1;
    }

    /**
    * Sets cUSTOMLABEL1.
    *
    * @param CatalogsProductGroupMultipleStringCriteria|null $cUSTOMLABEL1
    *
    * @return $this
    */
    public function setCUSTOMLABEL1(?CatalogsProductGroupMultipleStringCriteria $cUSTOMLABEL1): self
    {
        $this->cUSTOMLABEL1 = $cUSTOMLABEL1;

        return $this;
    }



}


