/*
 * BulkUpsertStatusResponse.h
 *
 * ID of the bulk request.
 */

#ifndef _BulkUpsertStatusResponse_H_
#define _BulkUpsertStatusResponse_H_


#include <string>
#include "BulkUpsertStatus.h"
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

class BulkUpsertStatusResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkUpsertStatusResponse();
	BulkUpsertStatusResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkUpsertStatusResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BulkUpsertStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BulkUpsertStatus  status);
	/*! \brief Get 
	 */
	std::string getResultUrl();

	/*! \brief Set 
	 */
	void setResultUrl(std::string  result_url);

private:
	BulkUpsertStatus status;
	std::string result_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkUpsertStatusResponse_H_ */
