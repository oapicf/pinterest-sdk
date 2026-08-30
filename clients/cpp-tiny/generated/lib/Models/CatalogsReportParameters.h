
/*
 * CatalogsReportParameters.h
 *
 * Report parameters
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportParameters_H_
#define TINY_CPP_CLIENT_CatalogsReportParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelReportParameters.h"
#include "CatalogsHotelReportParametersReport.h"
#include "CatalogsRetailReportParameters.h"

namespace Tiny {


/*! \brief Report parameters
 *
 *  \ingroup Models
 *
 */

class CatalogsReportParameters{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportParameters();
    CatalogsReportParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportParameters();


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
	CatalogsHotelReportParametersReport getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportParametersReport report);


    private:
    std::string catalog_type{};
    CatalogsHotelReportParametersReport report;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReportParameters_H_ */
