/*
 * ConversionProductReport.h
 *
 * 
 */

#ifndef _ConversionProductReport_H_
#define _ConversionProductReport_H_


#include <string>
#include "BulkReportingJobStatus.h"
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

class ConversionProductReport : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionProductReport();
	ConversionProductReport(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionProductReport();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Message returned from the create report request
	 */
	std::string getMessage();

	/*! \brief Set Message returned from the create report request
	 */
	void setMessage(std::string  message);
	/*! \brief Get Async report status
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set Async report status
	 */
	void setReportStatus(BulkReportingJobStatus  report_status);
	/*! \brief Get Size of the report in bytes
	 */
	long long getSize();

	/*! \brief Set Size of the report in bytes
	 */
	void setSize(long long  size);
	/*! \brief Get Token returned from the create report request
	 */
	std::string getToken();

	/*! \brief Set Token returned from the create report request
	 */
	void setToken(std::string  token);
	/*! \brief Get URL of the report
	 */
	std::string getUrl();

	/*! \brief Set URL of the report
	 */
	void setUrl(std::string  url);

private:
	std::string message;
	BulkReportingJobStatus report_status;
	long long size;
	std::string token;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionProductReport_H_ */
