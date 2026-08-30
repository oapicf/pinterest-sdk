/*
 * KeywordsCreate.h
 *
 * Resource create operation model.
 */

#ifndef _KeywordsCreate_H_
#define _KeywordsCreate_H_


#include <string>
#include "KeywordCreateItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class KeywordsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordsCreate();
	KeywordsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordsCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keywords
	 */
	std::list<KeywordCreateItem> getKeywords();

	/*! \brief Set Keywords
	 */
	void setKeywords(std::list <KeywordCreateItem> keywords);
	/*! \brief Get Keyword data
	 */
	std::string getParentId();

	/*! \brief Set Keyword data
	 */
	void setParentId(std::string  parent_id);

private:
	std::list <KeywordCreateItem>keywords;
	std::string parent_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordsCreate_H_ */
