/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * CatalogsCreativeAssetsProduct.h
 *
 * 
 */

#ifndef CatalogsCreativeAssetsProduct_H_
#define CatalogsCreativeAssetsProduct_H_


#include "CatalogsCreativeAssetsProductMetadata.h"
#include <string>
#include "Pin.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CatalogsCreativeAssetsProduct
{
public:
    CatalogsCreativeAssetsProduct();
    virtual ~CatalogsCreativeAssetsProduct() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CatalogsCreativeAssetsProduct& rhs) const;
    bool operator!=(const CatalogsCreativeAssetsProduct& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsProduct members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CatalogsCreativeAssetsProductMetadata getMetadata() const;
    void setMetadata(org::openapitools::server::model::CatalogsCreativeAssetsProductMetadata const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Pin getPin() const;
    void setPin(org::openapitools::server::model::Pin const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsCreativeAssetsProduct& o);
    friend  void from_json(const nlohmann::json& j, CatalogsCreativeAssetsProduct& o);
protected:
    std::string m_Catalog_type;

    org::openapitools::server::model::CatalogsCreativeAssetsProductMetadata m_Metadata;

    org::openapitools::server::model::Pin m_Pin;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsCreativeAssetsProduct_H_ */
