/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CatalogsHotelItemsFilter.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsHotelItemsFilter_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsHotelItemsFilter_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  CatalogsHotelItemsFilter
    : public ModelBase
{
public:
    CatalogsHotelItemsFilter();
    virtual ~CatalogsHotelItemsFilter();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CatalogsHotelItemsFilter members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCatalogType() const;
    bool catalogTypeIsSet() const;
    void unsetCatalog_type();

    void setCatalogType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<utility::string_t>& getHotelIds();
    bool hotelIdsIsSet() const;
    void unsetHotel_ids();

    void setHotelIds(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
    /// </summary>
    utility::string_t getCatalogId() const;
    bool catalogIdIsSet() const;
    void unsetCatalog_id();

    void setCatalogId(const utility::string_t& value);


protected:
    utility::string_t m_Catalog_type;
    bool m_Catalog_typeIsSet;
    std::vector<utility::string_t> m_Hotel_ids;
    bool m_Hotel_idsIsSet;
    utility::string_t m_Catalog_id;
    bool m_Catalog_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsHotelItemsFilter_H_ */
