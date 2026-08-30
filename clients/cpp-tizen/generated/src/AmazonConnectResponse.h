/*
 * AmazonConnectResponse.h
 *
 * 
 */

#ifndef _AmazonConnectResponse_H_
#define _AmazonConnectResponse_H_


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

class AmazonConnectResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AmazonConnectResponse();
	AmazonConnectResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AmazonConnectResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Amazon connect response message
	 */
	std::string getMessage();

	/*! \brief Set Amazon connect response message
	 */
	void setMessage(std::string  message);

private:
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AmazonConnectResponse_H_ */
