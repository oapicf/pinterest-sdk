/*
 * DynamicTitlesProcessCSVCreate.h
 *
 * Resource create operation model.
 */

#ifndef _DynamicTitlesProcessCSVCreate_H_
#define _DynamicTitlesProcessCSVCreate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesProcessCSVCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	DynamicTitlesProcessCSVCreate();
	DynamicTitlesProcessCSVCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DynamicTitlesProcessCSVCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The request_id returned from the GET uploads endpoint.
	 */
	std::string getRequestId();

	/*! \brief Set The request_id returned from the GET uploads endpoint.
	 */
	void setRequestId(std::string  request_id);

private:
	std::string request_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DynamicTitlesProcessCSVCreate_H_ */
