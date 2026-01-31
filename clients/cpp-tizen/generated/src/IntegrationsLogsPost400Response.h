/*
 * Integrations_logs_post_400_response.h
 *
 * 
 */

#ifndef _Integrations_logs_post_400_response_H_
#define _Integrations_logs_post_400_response_H_


#include <string>
#include "DetailedError.h"
#include "Error.h"
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

class Integrations_logs_post_400_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Integrations_logs_post_400_response();
	Integrations_logs_post_400_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Integrations_logs_post_400_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	std::string getDetails();

	/*! \brief Set 
	 */
	void setDetails(std::string  details);

private:
	int code;
	std::string message;
	std::string details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Integrations_logs_post_400_response_H_ */
