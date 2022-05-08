<?php
/**
 * GoogleProductCategory0Filter
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
 * Class representing the GoogleProductCategory0Filter model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class GoogleProductCategory0Filter 
{
        /**
     * @var OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria
     * @SerializedName("GOOGLE_PRODUCT_CATEGORY_0")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria")
     * @Type("OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria")
     */
    protected $gOOGLEPRODUCTCATEGORY0;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->gOOGLEPRODUCTCATEGORY0 = isset($data['gOOGLEPRODUCTCATEGORY0']) ? $data['gOOGLEPRODUCTCATEGORY0'] : null;
    }

    /**
     * Gets gOOGLEPRODUCTCATEGORY0.
     *
     * @return OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria
     */
    public function getGOOGLEPRODUCTCATEGORY0(): CatalogsProductGroupMultipleStringListCriteria
    {
        return $this->gOOGLEPRODUCTCATEGORY0;
    }

    /**
     * Sets gOOGLEPRODUCTCATEGORY0.
     *
     * @param OpenAPI\Server\Model\CatalogsProductGroupMultipleStringListCriteria $gOOGLEPRODUCTCATEGORY0
     *
     * @return $this
     */
    public function setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria $gOOGLEPRODUCTCATEGORY0)
    {
        $this->gOOGLEPRODUCTCATEGORY0 = $gOOGLEPRODUCTCATEGORY0;

        return $this;
    }
}

