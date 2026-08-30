
/*
 * KeywordError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordError_H_
#define TINY_CPP_CLIENT_KeywordError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Keyword.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordError{
public:

    /*! \brief Constructor.
	 */
    KeywordError();
    KeywordError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Keyword getData();

	/*! \brief Set 
	 */
	void setData(Keyword data);
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
	 */
	void setErrorMessages(std::list<std::string> error_messages);


    private:
    Keyword data;
    std::list<std::string> error_messages;
};
}

#endif /* TINY_CPP_CLIENT_KeywordError_H_ */
