/*
 * Campaign_ad_preview_delete_200_response_inner_status.h
 *
 * 
 */

#ifndef _Campaign_ad_preview_delete_200_response_inner_status_H_
#define _Campaign_ad_preview_delete_200_response_inner_status_H_


#include <string>
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.Status204.h"
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

class Campaign_ad_preview_delete_200_response_inner_status : public Object {
public:
	/*! \brief Constructor.
	 */
	Campaign_ad_preview_delete_200_response_inner_status();
	Campaign_ad_preview_delete_200_response_inner_status(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Campaign_ad_preview_delete_200_response_inner_status();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getStatusCode();

	/*! \brief Set 
	 */
	void setStatusCode(long long  statusCode);
	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);

private:
	long long statusCode;
	int code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Campaign_ad_preview_delete_200_response_inner_status_H_ */
