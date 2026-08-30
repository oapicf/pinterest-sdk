/*
 * KeywordsUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef _KeywordsUpdate_H_
#define _KeywordsUpdate_H_


#include <string>
#include "KeywordUpdateItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class KeywordsUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordsUpdate();
	KeywordsUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordsUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keywords
	 */
	std::list<KeywordUpdateItem> getKeywords();

	/*! \brief Set Keywords
	 */
	void setKeywords(std::list <KeywordUpdateItem> keywords);

private:
	std::list <KeywordUpdateItem>keywords;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordsUpdate_H_ */
