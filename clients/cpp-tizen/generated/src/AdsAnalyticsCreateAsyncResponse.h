/*
 * AdsAnalyticsCreateAsyncResponse.h
 *
 * 
 */

#ifndef _AdsAnalyticsCreateAsyncResponse_H_
#define _AdsAnalyticsCreateAsyncResponse_H_


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

class AdsAnalyticsCreateAsyncResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsCreateAsyncResponse();
	AdsAnalyticsCreateAsyncResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsCreateAsyncResponse();

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

private:
	std::string report_status;
	std::string token;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsCreateAsyncResponse_H_ */
