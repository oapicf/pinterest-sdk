/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * CatalogsCreateHotelItem.h
 *
 * A hotel item to be created.
 */

#ifndef CatalogsCreateHotelItem_H_
#define CatalogsCreateHotelItem_H_


#include <string>
#include "CatalogsHotelAttributes.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// A hotel item to be created.
/// </summary>
class  CatalogsCreateHotelItem
{
public:
    CatalogsCreateHotelItem();
    virtual ~CatalogsCreateHotelItem() = default;


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

    bool operator==(const CatalogsCreateHotelItem& rhs) const;
    bool operator!=(const CatalogsCreateHotelItem& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsCreateHotelItem members

    /// <summary>
    /// The catalog hotel id in the merchant namespace
    /// </summary>
    std::string getHotelId() const;
    void setHotelId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getOperation() const;
    void setOperation(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CatalogsHotelAttributes getAttributes() const;
    void setAttributes(org::openapitools::server::model::CatalogsHotelAttributes const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsCreateHotelItem& o);
    friend  void from_json(const nlohmann::json& j, CatalogsCreateHotelItem& o);
protected:
    std::string m_Hotel_id;

    std::string m_Operation;

    org::openapitools::server::model::CatalogsHotelAttributes m_Attributes;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsCreateHotelItem_H_ */