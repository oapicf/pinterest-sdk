/*
 * Keyword.h
 *
 * 
 */

#ifndef _Keyword_H_
#define _Keyword_H_


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

class Keyword : public Object {
public:
	/*! \brief Constructor.
	 */
	Keyword();
	Keyword(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Keyword();

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
	/*! \brief Get 
	 */
	bool getArchived();

	/*! \brief Set 
	 */
	void setArchived(bool  archived);
	/*! \brief Get Keyword ID .
	 */
	std::string getId();

	/*! \brief Set Keyword ID .
	 */
	void setId(std::string  id);
	/*! \brief Get Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	std::string getParentId();

	/*! \brief Set Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get Parent entity type
	 */
	std::string getParentType();

	/*! \brief Set Parent entity type
	 */
	void setParentType(std::string  parent_type);
	/*! \brief Get Always keyword
	 */
	std::string getType();

	/*! \brief Set Always keyword
	 */
	void setType(std::string  type);

private:
	int bid;
	MatchTypeResponse match_type;
	std::string value;
	bool archived;
	std::string id;
	std::string parent_id;
	std::string parent_type;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Keyword_H_ */
