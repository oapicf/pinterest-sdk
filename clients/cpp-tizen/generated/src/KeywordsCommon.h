/*
 * KeywordsCommon.h
 *
 * 
 */

#ifndef _KeywordsCommon_H_
#define _KeywordsCommon_H_


#include <string>
#include "MatchTypeResponse.h"
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

class KeywordsCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordsCommon();
	KeywordsCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordsCommon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int  bid);
	/*! \brief Get 
	 */
	MatchTypeResponse getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(MatchTypeResponse  match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string  value);

private:
	int bid;
	MatchTypeResponse match_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordsCommon_H_ */
