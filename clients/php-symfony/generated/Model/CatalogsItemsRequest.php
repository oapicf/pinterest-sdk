<?php
/**
 * CatalogsItemsRequest
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
 * Class representing the CatalogsItemsRequest model.
 *
 * Request object of catalogs items
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsItemsRequest 
{
        /**
     * @var Country|null
     * @SerializedName("country")
    * @Accessor(getter="getSerializedCountry", setter="setDeserializedCountry")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?Country $country = null;

    /**
     * @var CatalogsItemsRequestLanguage|null
     * @SerializedName("language")
     * @Type("OpenAPI\Server\Model\CatalogsItemsRequestLanguage")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CatalogsItemsRequestLanguage")]
    protected ?CatalogsItemsRequestLanguage $language = null;

    /**
     * @var CatalogsItemsPostFilters|null
     * @SerializedName("filters")
     * @Type("OpenAPI\Server\Model\CatalogsItemsPostFilters")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CatalogsItemsPostFilters")]
    protected ?CatalogsItemsPostFilters $filters = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->country = array_key_exists('country', $data) ? $data['country'] : $this->country;
            $this->language = array_key_exists('language', $data) ? $data['language'] : $this->language;
            $this->filters = array_key_exists('filters', $data) ? $data['filters'] : $this->filters;
        }
    }

    /**
     * Gets country.
     *
     * @return Country|null
     */
    public function getCountry(): ?Country
    {
        return $this->country;
    }

    /**
    * Sets country.
    *
    * @param Country|null $country
    *
    * @return $this
    */
    public function setCountry(?Country $country): self
    {
        $this->country = $country;

        return $this;
    }

    /**
    * Gets country for serialization.
    *
    * @return string|null
    */
    public function getSerializedCountry(): string|null
    {
        return !is_null($this->country?->value) ? (string) $this->country->value : null;
    }

    /**
    * Sets country.
    *
    * @param string|Country|null $country
    *
    * @return $this
    */
    public function setDeserializedCountry(string|Country|null $country): self
    {
        if (is_string($country)) {
            $country = Country::tryFrom($country);
        }

        $this->country = $country;

        return $this;
    }



    /**
     * Gets language.
     *
     * @return CatalogsItemsRequestLanguage|null
     */
    public function getLanguage(): ?CatalogsItemsRequestLanguage
    {
        return $this->language;
    }

    /**
    * Sets language.
    *
    * @param CatalogsItemsRequestLanguage|null $language
    *
    * @return $this
    */
    public function setLanguage(?CatalogsItemsRequestLanguage $language): self
    {
        $this->language = $language;

        return $this;
    }




    /**
     * Gets filters.
     *
     * @return CatalogsItemsPostFilters|null
     */
    public function getFilters(): ?CatalogsItemsPostFilters
    {
        return $this->filters;
    }

    /**
    * Sets filters.
    *
    * @param CatalogsItemsPostFilters|null $filters
    *
    * @return $this
    */
    public function setFilters(?CatalogsItemsPostFilters $filters): self
    {
        $this->filters = $filters;

        return $this;
    }



}


