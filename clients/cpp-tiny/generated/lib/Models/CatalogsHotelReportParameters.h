
/*
 * CatalogsHotelReportParameters.h
 *
 * Parameters for hotel report
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelReportParameters_H_
#define TINY_CPP_CLIENT_CatalogsHotelReportParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelReportParameters_report.h"

namespace Tiny {


/*! \brief Parameters for hotel report
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelReportParameters{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelReportParameters();
    CatalogsHotelReportParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelReportParameters();


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
	CatalogsHotelReportParameters_report getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportParameters_report  report);


    private:
    std::string catalog_type{};
    CatalogsHotelReportParameters_report report;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelReportParameters_H_ */
