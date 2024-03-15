/*
 * CreateMMMReportResponseData.h
 *
 * 
 */

#ifndef _CreateMMMReportResponseData_H_
#define _CreateMMMReportResponseData_H_


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

class CreateMMMReportResponseData : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMMMReportResponseData();
	CreateMMMReportResponseData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMMMReportResponseData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus  report_status);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string  token);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string  status);

private:
	BulkReportingJobStatus report_status;
	std::string token;
	std::string message;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMMMReportResponseData_H_ */
