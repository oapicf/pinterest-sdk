/*
 * KeywordCreateItem.h
 *
 * 
 */

#ifndef _KeywordCreateItem_H_
#define _KeywordCreateItem_H_


#include <string>
#include "MatchType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordCreateItem : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordCreateItem();
	KeywordCreateItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordCreateItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int  bid);
	/*! \brief Get Keyword [match type](/docs/api-features/targeting-overview/)
	 */
	MatchType getMatchType();

	/*! \brief Set Keyword [match type](/docs/api-features/targeting-overview/)
	 */
	void setMatchType(MatchType  match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string  value);

private:
	int bid;
	MatchType match_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordCreateItem_H_ */
