/*
 * GetMMMReportResponse.h
 *
 * 
 */

#ifndef _GetMMMReportResponse_H_
#define _GetMMMReportResponse_H_


#include <string>
#include "GetMMMReportResponseData.h"
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

class GetMMMReportResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetMMMReportResponse();
	GetMMMReportResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetMMMReportResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getCode();

	/*! \brief Set 
	 */
	void setCode(long long  code);
	/*! \brief Get 
	 */
	GetMMMReportResponseData getData();

	/*! \brief Set 
	 */
	void setData(GetMMMReportResponseData  data);
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
	long long code;
	GetMMMReportResponseData data;
	std::string message;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetMMMReportResponse_H_ */
