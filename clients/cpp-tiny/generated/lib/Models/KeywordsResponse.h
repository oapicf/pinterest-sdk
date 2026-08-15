
/*
 * KeywordsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordsResponse_H_
#define TINY_CPP_CLIENT_KeywordsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Keyword.h"
#include "KeywordError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordsResponse{
public:

    /*! \brief Constructor.
	 */
    KeywordsResponse();
    KeywordsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<KeywordError> getErrors();

	/*! \brief Set 
	 */
	void setErrors(std::list <KeywordError> errors);
	/*! \brief Get 
	 */
	std::list<Keyword> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list <Keyword> keywords);


    private:
    std::list<KeywordError> errors;
    std::list<Keyword> keywords;
};
}

#endif /* TINY_CPP_CLIENT_KeywordsResponse_H_ */
