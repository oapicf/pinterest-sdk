
/*
 * CatalogsReportStatsParameters.h
 *
 * Report stats parameters
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportStatsParameters_H_
#define TINY_CPP_CLIENT_CatalogsReportStatsParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelReportStatsParameters.h"
#include "CatalogsHotelReportStatsParametersReport.h"
#include "CatalogsRetailReportStatsParameters.h"

namespace Tiny {


/*! \brief Report stats parameters
 *
 *  \ingroup Models
 *
 */

class CatalogsReportStatsParameters{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportStatsParameters();
    CatalogsReportStatsParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportStatsParameters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelReportStatsParametersReport getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportStatsParametersReport report);


    private:
    std::string catalog_type{};
    CatalogsHotelReportStatsParametersReport report;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReportStatsParameters_H_ */
