
/*
 * CatalogsReport.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsReport_H_
#define TINY_CPP_CLIENT_CatalogsReport_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReport{
public:

    /*! \brief Constructor.
	 */
    CatalogsReport();
    CatalogsReport(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReport();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(std::string  report_status);
	/*! \brief Get Size of the report in bytes
	 */
	long getSize();

	/*! \brief Set Size of the report in bytes
	 */
	void setSize(long  size);
	/*! \brief Get URL to download the report
	 */
	std::string getUrl();

	/*! \brief Set URL to download the report
	 */
	void setUrl(std::string  url);


    private:
    std::string report_status{};
    long size{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReport_H_ */
