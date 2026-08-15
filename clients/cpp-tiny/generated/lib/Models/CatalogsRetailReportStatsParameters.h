
/*
 * CatalogsRetailReportStatsParameters.h
 *
 * Parameters for retail report
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailReportStatsParameters_H_
#define TINY_CPP_CLIENT_CatalogsRetailReportStatsParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelReportStatsParameters_report.h"

namespace Tiny {


/*! \brief Parameters for retail report
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailReportStatsParameters{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailReportStatsParameters();
    CatalogsRetailReportStatsParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailReportStatsParameters();


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
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelReportStatsParameters_report getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportStatsParameters_report  report);


    private:
    std::string catalog_type{};
    CatalogsHotelReportStatsParameters_report report;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailReportStatsParameters_H_ */
