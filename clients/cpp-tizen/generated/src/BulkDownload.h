/*
 * BulkDownload.h
 *
 * Ad entities to get in bulk request.
 */

#ifndef _BulkDownload_H_
#define _BulkDownload_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad entities to get in bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkDownload : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkDownload();
	BulkDownload(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkDownload();

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

#endif /* _BulkDownload_H_ */
