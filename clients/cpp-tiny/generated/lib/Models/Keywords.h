
/*
 * Keywords.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Keywords_H_
#define TINY_CPP_CLIENT_Keywords_H_


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

class Keywords{
public:

    /*! \brief Constructor.
	 */
    Keywords();
    Keywords(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Keywords();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keyword error
	 */
	std::list<KeywordError> getErrors();

	/*! \brief Set Keyword error
	 */
	void setErrors(std::list<KeywordError> errors);
	/*! \brief Get Keywords
	 */
	std::list<Keyword> getKeywords();

	/*! \brief Set Keywords
	 */
	void setKeywords(std::list<Keyword> keywords);


    private:
    std::list<KeywordError> errors;
    std::list<Keyword> keywords;
};
}

#endif /* TINY_CPP_CLIENT_Keywords_H_ */
