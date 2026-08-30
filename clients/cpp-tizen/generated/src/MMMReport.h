/*
 * MMMReport.h
 *
 * 
 */

#ifndef _MMMReport_H_
#define _MMMReport_H_


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

class MMMReport : public Object {
public:
	/*! \brief Constructor.
	 */
	MMMReport();
	MMMReport(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MMMReport();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus  report_status);
	/*! \brief Get 
	 */
	long long getSize();

	/*! \brief Set 
	 */
	void setSize(long long  size);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string  token);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string message;
	BulkReportingJobStatus report_status;
	long long size;
	std::string status;
	std::string token;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MMMReport_H_ */
