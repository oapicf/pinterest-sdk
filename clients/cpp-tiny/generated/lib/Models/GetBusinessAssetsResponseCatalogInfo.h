
/*
 * GetBusinessAssetsResponse_catalog_info.h
 *
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 */

#ifndef TINY_CPP_CLIENT_GetBusinessAssetsResponse_catalog_info_H_
#define TINY_CPP_CLIENT_GetBusinessAssetsResponse_catalog_info_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 *
 *  \ingroup Models
 *
 */

class GetBusinessAssetsResponse_catalog_info{
public:

    /*! \brief Constructor.
	 */
    GetBusinessAssetsResponse_catalog_info();
    GetBusinessAssetsResponse_catalog_info(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessAssetsResponse_catalog_info();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog type
	 */
	std::string getCatalogType();

	/*! \brief Set Catalog type
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get Catalog ID.
	 */
	std::string getId();

	/*! \brief Set Catalog ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Catalog name
	 */
	std::string getName();

	/*! \brief Set Catalog name
	 */
	void setName(std::string  name);


    private:
    std::string catalog_type{};
    std::string id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessAssetsResponse_catalog_info_H_ */
