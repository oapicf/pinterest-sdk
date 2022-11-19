/*
 * BulkUpsertResponse.h
 *
 * ID of the bulk request.
 */

#ifndef _BulkUpsertResponse_H_
#define _BulkUpsertResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ID of the bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkUpsertResponse();
	BulkUpsertResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkUpsertResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getRequestId();

	/*! \brief Set 
	 */
	void setRequestId(std::string  request_id);

private:
	std::string request_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkUpsertResponse_H_ */
