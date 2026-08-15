
/*
 * CatalogsReportAllItemsFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportAllItemsFilter_H_
#define TINY_CPP_CLIENT_CatalogsReportAllItemsFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReportAllItemsFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportAllItemsFilter();
    CatalogsReportAllItemsFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportAllItemsFilter();


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
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);


    private:
    std::string catalog_id{};
    std::string report_type{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReportAllItemsFilter_H_ */
