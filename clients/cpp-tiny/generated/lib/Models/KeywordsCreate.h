
/*
 * KeywordsCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_KeywordsCreate_H_
#define TINY_CPP_CLIENT_KeywordsCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordCreateItem.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class KeywordsCreate{
public:

    /*! \brief Constructor.
	 */
    KeywordsCreate();
    KeywordsCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordsCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keywords
	 */
	std::list<KeywordCreateItem> getKeywords();

	/*! \brief Set Keywords
	 */
	void setKeywords(std::list<KeywordCreateItem> keywords);
	/*! \brief Get Keyword data
	 */
	std::string getParentId();

	/*! \brief Set Keyword data
	 */
	void setParentId(std::string parent_id);


    private:
    std::list<KeywordCreateItem> keywords;
    std::string parent_id{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordsCreate_H_ */
