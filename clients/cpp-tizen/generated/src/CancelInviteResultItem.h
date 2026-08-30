/*
 * CancelInviteResultItem.h
 *
 * 
 */

#ifndef _CancelInviteResultItem_H_
#define _CancelInviteResultItem_H_


#include <string>
#include "CancelInviteException.h"
#include "CancelInviteResult.h"
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

class CancelInviteResultItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInviteResultItem();
	CancelInviteResultItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInviteResultItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CancelInviteException getException();

	/*! \brief Set 
	 */
	void setException(CancelInviteException  exception);
	/*! \brief Get 
	 */
	CancelInviteResult getInvite();

	/*! \brief Set 
	 */
	void setInvite(CancelInviteResult  invite);

private:
	CancelInviteException exception;
	CancelInviteResult invite;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInviteResultItem_H_ */
