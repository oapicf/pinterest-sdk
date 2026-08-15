
/*
 * CatalogsReportDistributionIssueFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportDistributionIssueFilter_H_
#define TINY_CPP_CLIENT_CatalogsReportDistributionIssueFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReportDistributionIssueFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportDistributionIssueFilter();
    CatalogsReportDistributionIssueFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportDistributionIssueFilter();


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

#endif /* TINY_CPP_CLIENT_CatalogsReportDistributionIssueFilter_H_ */
