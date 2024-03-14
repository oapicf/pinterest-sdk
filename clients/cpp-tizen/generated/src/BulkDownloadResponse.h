/*
 * BulkDownloadResponse.h
 *
 * 
 */

#ifndef _BulkDownloadResponse_H_
#define _BulkDownloadResponse_H_


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

class BulkDownloadResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkDownloadResponse();
	BulkDownloadResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkDownloadResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the bulk request.
	 */
	std::string getRequestId();

	/*! \brief Set ID of the bulk request.
	 */
	void setRequestId(std::string  request_id);

private:
	std::string request_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkDownloadResponse_H_ */
