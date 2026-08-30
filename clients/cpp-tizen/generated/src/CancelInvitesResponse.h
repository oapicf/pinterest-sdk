/*
 * CancelInvitesResponse.h
 *
 * 
 */

#ifndef _CancelInvitesResponse_H_
#define _CancelInvitesResponse_H_


#include <string>
#include "CancelInviteResultItem.h"
#include <list>
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

class CancelInvitesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInvitesResponse();
	CancelInvitesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInvitesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CancelInviteResultItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CancelInviteResultItem> items);

private:
	std::list <CancelInviteResultItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInvitesResponse_H_ */
