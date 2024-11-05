/*
 * CatalogsReport.h
 *
 * 
 */

#ifndef _CatalogsReport_H_
#define _CatalogsReport_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReport : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsReport();
	CatalogsReport(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsReport();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(std::string  report_status);
	/*! \brief Get URL to download the report
	 */
	std::string getUrl();

	/*! \brief Set URL to download the report
	 */
	void setUrl(std::string  url);
	/*! \brief Get Size of the report in bytes
	 */
	long long getSize();

	/*! \brief Set Size of the report in bytes
	 */
	void setSize(long long  size);

private:
	std::string report_status;
	std::string url;
	long long size;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsReport_H_ */
