
/*
 * CatalogsRetailReportAllItemsFilter.h
 *
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailReportAllItemsFilter_H_
#define TINY_CPP_CLIENT_CatalogsRetailReportAllItemsFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailReportAllItemsFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailReportAllItemsFilter();
    CatalogsRetailReportAllItemsFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailReportAllItemsFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	std::string getCatalogId();

	/*! \brief Set Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	void setCatalogId(std::string catalog_id);
	/*! \brief Get Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
	 */
	std::string getProductGroupId();

	/*! \brief Set Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
	 */
	void setProductGroupId(std::string product_group_id);
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string report_type);


    private:
    std::string catalog_id{};
    std::string product_group_id{};
    std::string report_type{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailReportAllItemsFilter_H_ */
