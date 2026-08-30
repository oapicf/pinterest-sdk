
/*
 * CancelInviteResultItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CancelInviteResultItem_H_
#define TINY_CPP_CLIENT_CancelInviteResultItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CancelInviteException.h"
#include "CancelInviteResult.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CancelInviteResultItem{
public:

    /*! \brief Constructor.
	 */
    CancelInviteResultItem();
    CancelInviteResultItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CancelInviteResultItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CancelInviteException getException();

	/*! \brief Set 
	 */
	void setException(CancelInviteException exception);
	/*! \brief Get 
	 */
	CancelInviteResult getInvite();

	/*! \brief Set 
	 */
	void setInvite(CancelInviteResult invite);


    private:
    CancelInviteException exception;
    CancelInviteResult invite;
};
}

#endif /* TINY_CPP_CLIENT_CancelInviteResultItem_H_ */
