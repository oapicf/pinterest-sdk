
/*
 * CatalogsHotelReportStatsParameters.h
 *
 * Parameters for hotel report
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelReportStatsParameters_H_
#define TINY_CPP_CLIENT_CatalogsHotelReportStatsParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelReportStatsParametersReport.h"

namespace Tiny {


/*! \brief Parameters for hotel report
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelReportStatsParameters{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelReportStatsParameters();
    CatalogsHotelReportStatsParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelReportStatsParameters();


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

#endif /* TINY_CPP_CLIENT_CatalogsHotelReportStatsParameters_H_ */
