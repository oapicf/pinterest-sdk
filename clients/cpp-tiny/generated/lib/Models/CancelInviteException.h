
/*
 * CancelInviteException.h
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

#ifndef TINY_CPP_CLIENT_CancelInviteException_H_
#define TINY_CPP_CLIENT_CancelInviteException_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 *  \ingroup Models
 *
 */

class CancelInviteException{
public:

    /*! \brief Constructor.
	 */
    CancelInviteException();
    CancelInviteException(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CancelInviteException();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getInviteId();

	/*! \brief Set 
	 */
	void setInviteId(std::string invite_id);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);


    private:
    std::string invite_id{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_CancelInviteException_H_ */
