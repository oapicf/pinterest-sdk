<?php
/**
 * GoogleProductCategory0Filter
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
 * Class representing the GoogleProductCategory0Filter model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GoogleProductCategory0Filter 
{
        /**
     * @var CatalogsProductGroupMultipleStringListCriteria|null
     * @SerializedName("GOOGLE_PRODUCT_CATEGORY_0")
     * @Type("OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria")]
    protected ?CatalogsProductGroupMultipleStringListCriteria $gOOGLEPRODUCTCATEGORY0 = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->gOOGLEPRODUCTCATEGORY0 = array_key_exists('gOOGLEPRODUCTCATEGORY0', $data) ? $data['gOOGLEPRODUCTCATEGORY0'] : $this->gOOGLEPRODUCTCATEGORY0;
        }
    }

    /**
     * Gets gOOGLEPRODUCTCATEGORY0.
     *
     * @return CatalogsProductGroupMultipleStringListCriteria|null
     */
    public function getGOOGLEPRODUCTCATEGORY0(): ?CatalogsProductGroupMultipleStringListCriteria
    {
        return $this->gOOGLEPRODUCTCATEGORY0;
    }

    /**
    * Sets gOOGLEPRODUCTCATEGORY0.
    *
    * @param CatalogsProductGroupMultipleStringListCriteria|null $gOOGLEPRODUCTCATEGORY0
    *
    * @return $this
    */
    public function setGOOGLEPRODUCTCATEGORY0(?CatalogsProductGroupMultipleStringListCriteria $gOOGLEPRODUCTCATEGORY0): self
    {
        $this->gOOGLEPRODUCTCATEGORY0 = $gOOGLEPRODUCTCATEGORY0;

        return $this;
    }



}


