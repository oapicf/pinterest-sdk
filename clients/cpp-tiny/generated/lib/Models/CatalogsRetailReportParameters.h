
/*
 * CatalogsRetailReportParameters.h
 *
 * Parameters for retail report
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailReportParameters_H_
#define TINY_CPP_CLIENT_CatalogsRetailReportParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsRetailReportParametersReport.h"

namespace Tiny {


/*! \brief Parameters for retail report
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailReportParameters{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailReportParameters();
    CatalogsRetailReportParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailReportParameters();


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
	CatalogsRetailReportParametersReport getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsRetailReportParametersReport report);


    private:
    std::string catalog_type{};
    CatalogsRetailReportParametersReport report;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailReportParameters_H_ */
