<?php
/**
 * CatalogsRetailProductGroupUpdateRequest
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
 * Class representing the CatalogsRetailProductGroupUpdateRequest model.
 *
 * Request object for updating a retail product group.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsRetailProductGroupUpdateRequest 
{
        /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     *
     * @var string|null
     * @SerializedName("catalog_type")
     * @Type("string")
    */
    #[Assert\Choice(["RETAIL"])]
    #[Assert\Type("string")]
    protected ?string $catalogType = null;

    /**
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * @var string|null
     * @SerializedName("description")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $description = null;

    /**
     * @var CatalogsProductGroupFiltersRequest|null
     * @SerializedName("filters")
     * @Type("OpenAPI\Server\Model\CatalogsProductGroupFiltersRequest")
    */
    #[Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupFiltersRequest")]
    protected ?CatalogsProductGroupFiltersRequest $filters = null;

    /**
     * @var Country|null
     * @SerializedName("country")
    * @Accessor(getter="getSerializedCountry", setter="setDeserializedCountry")
    * @Type("string")
    */
    protected ?Country $country = null;

    /**
     * @var CatalogsLocale|null
     * @SerializedName("locale")
    * @Accessor(getter="getSerializedLocale", setter="setDeserializedLocale")
    * @Type("string")
    */
    protected ?CatalogsLocale $locale = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->catalogType = array_key_exists('catalogType', $data) ? $data['catalogType'] : $this->catalogType;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->description = array_key_exists('description', $data) ? $data['description'] : $this->description;
            $this->filters = array_key_exists('filters', $data) ? $data['filters'] : $this->filters;
            $this->country = array_key_exists('country', $data) ? $data['country'] : $this->country;
            $this->locale = array_key_exists('locale', $data) ? $data['locale'] : $this->locale;
        }
    }

    /**
     * Gets catalogType.
     *
     * @return string|null
     */
    public function getCatalogType(): ?string
    {
        return $this->catalogType;
    }

    /**
    * Sets catalogType.
    *
    * @param string|null $catalogType  Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
    *
    * @return $this
    */
    public function setCatalogType(?string $catalogType = null): self
    {
        $this->catalogType = $catalogType;

        return $this;
    }




    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name
    *
    * @return $this
    */
    public function setName(?string $name = null): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets description.
     *
     * @return string|null
     */
    public function getDescription(): ?string
    {
        return $this->description;
    }

    /**
    * Sets description.
    *
    * @param string|null $description
    *
    * @return $this
    */
    public function setDescription(?string $description = null): self
    {
        $this->description = $description;

        return $this;
    }




    /**
     * Gets filters.
     *
     * @return CatalogsProductGroupFiltersRequest|null
     */
    public function getFilters(): ?CatalogsProductGroupFiltersRequest
    {
        return $this->filters;
    }

    /**
    * Sets filters.
    *
    * @param CatalogsProductGroupFiltersRequest|null $filters
    *
    * @return $this
    */
    public function setFilters(?CatalogsProductGroupFiltersRequest $filters = null): self
    {
        $this->filters = $filters;

        return $this;
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
    public function setCountry(?Country $country = null): self
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
    public function setDeserializedCountry(string|Country|null $country = null): self
    {
        if (is_string($country)) {
            $country = Country::tryFrom($country);
        }

        $this->country = $country;

        return $this;
    }



    /**
     * Gets locale.
     *
     * @return CatalogsLocale|null
     */
    public function getLocale(): ?CatalogsLocale
    {
        return $this->locale;
    }

    /**
    * Sets locale.
    *
    * @param CatalogsLocale|null $locale
    *
    * @return $this
    */
    public function setLocale(?CatalogsLocale $locale = null): self
    {
        $this->locale = $locale;

        return $this;
    }

    /**
    * Gets locale for serialization.
    *
    * @return string|null
    */
    public function getSerializedLocale(): string|null
    {
        return !is_null($this->locale?->value) ? (string) $this->locale->value : null;
    }

    /**
    * Sets locale.
    *
    * @param string|CatalogsLocale|null $locale
    *
    * @return $this
    */
    public function setDeserializedLocale(string|CatalogsLocale|null $locale = null): self
    {
        if (is_string($locale)) {
            $locale = CatalogsLocale::tryFrom($locale);
        }

        $this->locale = $locale;

        return $this;
    }


}


