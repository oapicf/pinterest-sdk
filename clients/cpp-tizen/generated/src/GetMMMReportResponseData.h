/*
 * GetMMMReportResponseData.h
 *
 * 
 */

#ifndef _GetMMMReportResponseData_H_
#define _GetMMMReportResponseData_H_


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

class GetMMMReportResponseData : public Object {
public:
	/*! \brief Constructor.
	 */
	GetMMMReportResponseData();
	GetMMMReportResponseData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetMMMReportResponseData();

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
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	long long getSize();

	/*! \brief Set 
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

#endif /* _GetMMMReportResponseData_H_ */
