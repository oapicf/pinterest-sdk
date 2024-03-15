/*
 * IntegrationLogsSuccessResponse.h
 *
 * Response when logs are successfully processed.
 */

#ifndef _IntegrationLogsSuccessResponse_H_
#define _IntegrationLogsSuccessResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response when logs are successfully processed.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsSuccessResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogsSuccessResponse();
	IntegrationLogsSuccessResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogsSuccessResponse();

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

private:
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLogsSuccessResponse_H_ */
