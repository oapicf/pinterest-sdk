
/*
 * CreateAssetAccessRequestErrorMessage_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssetAccessRequestErrorMessage_inner_H_
#define TINY_CPP_CLIENT_CreateAssetAccessRequestErrorMessage_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateAssetAccessRequestErrorMessage_inner{
public:

    /*! \brief Constructor.
	 */
    CreateAssetAccessRequestErrorMessage_inner();
    CreateAssetAccessRequestErrorMessage_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetAccessRequestErrorMessage_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Error code associated with the error in requesting asset access.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error in requesting asset access.
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::list<std::string> getMessages();

	/*! \brief Set 
	 */
	void setMessages(std::list <std::string> messages);


    private:
    int code{};
    std::list<std::string> messages;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetAccessRequestErrorMessage_inner_H_ */
