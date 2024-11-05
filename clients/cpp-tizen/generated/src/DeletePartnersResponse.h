/*
 * DeletePartnersResponse.h
 *
 * An object with a list of partners that were deleted.
 */

#ifndef _DeletePartnersResponse_H_
#define _DeletePartnersResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of partners that were deleted.
 *
 *  \ingroup Models
 *
 */

class DeletePartnersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnersResponse();
	DeletePartnersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnersResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of partners whose business partnership have been terminated.
	 */
	std::list<std::string> getDeletedPartners();

	/*! \brief Set List of partners whose business partnership have been terminated.
	 */
	void setDeletedPartners(std::list <std::string> deleted_partners);

private:
	std::list <std::string>deleted_partners;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnersResponse_H_ */
