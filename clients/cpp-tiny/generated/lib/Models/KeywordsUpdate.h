
/*
 * KeywordsUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef TINY_CPP_CLIENT_KeywordsUpdate_H_
#define TINY_CPP_CLIENT_KeywordsUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordUpdateItem.h"
#include <list>

namespace Tiny {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class KeywordsUpdate{
public:

    /*! \brief Constructor.
	 */
    KeywordsUpdate();
    KeywordsUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordsUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keywords
	 */
	std::list<KeywordUpdateItem> getKeywords();

	/*! \brief Set Keywords
	 */
	void setKeywords(std::list<KeywordUpdateItem> keywords);


    private:
    std::list<KeywordUpdateItem> keywords;
};
}

#endif /* TINY_CPP_CLIENT_KeywordsUpdate_H_ */
