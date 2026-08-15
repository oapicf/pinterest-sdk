
/*
 * KeywordUpdateBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordUpdateBody_H_
#define TINY_CPP_CLIENT_KeywordUpdateBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordUpdate.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordUpdateBody{
public:

    /*! \brief Constructor.
	 */
    KeywordUpdateBody();
    KeywordUpdateBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordUpdateBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
	 */
	std::list<KeywordUpdate> getKeywords();

	/*! \brief Set Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
	 */
	void setKeywords(std::list <KeywordUpdate> keywords);


    private:
    std::list<KeywordUpdate> keywords;
};
}

#endif /* TINY_CPP_CLIENT_KeywordUpdateBody_H_ */
