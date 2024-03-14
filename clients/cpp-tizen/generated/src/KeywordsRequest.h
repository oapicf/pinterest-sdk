/*
 * KeywordsRequest.h
 *
 * 
 */

#ifndef _KeywordsRequest_H_
#define _KeywordsRequest_H_


#include <string>
#include "KeywordsCommon.h"
#include <list>
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

class KeywordsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordsRequest();
	KeywordsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keyword JSON array. Each array element has 3 fields
	 */
	std::list<KeywordsCommon> getKeywords();

	/*! \brief Set Keyword JSON array. Each array element has 3 fields
	 */
	void setKeywords(std::list <KeywordsCommon> keywords);
	/*! \brief Get Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	std::string getParentId();

	/*! \brief Set Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	void setParentId(std::string  parent_id);

private:
	std::list <KeywordsCommon>keywords;
	std::string parent_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordsRequest_H_ */
