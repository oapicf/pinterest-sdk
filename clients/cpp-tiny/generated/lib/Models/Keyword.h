
/*
 * Keyword.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Keyword_H_
#define TINY_CPP_CLIENT_Keyword_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MatchType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Keyword{
public:

    /*! \brief Constructor.
	 */
    Keyword();
    Keyword(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Keyword();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isArchived();

	/*! \brief Set 
	 */
	void setArchived(bool archived);
	/*! \brief Get **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int bid);
	/*! \brief Get Keyword ID .
	 */
	std::string getId();

	/*! \brief Set Keyword ID .
	 */
	void setId(std::string id);
	/*! \brief Get Keyword [match type](/docs/api-features/targeting-overview/)
	 */
	MatchType getMatchType();

	/*! \brief Set Keyword [match type](/docs/api-features/targeting-overview/)
	 */
	void setMatchType(MatchType match_type);
	/*! \brief Get Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	std::string getParentId();

	/*! \brief Set Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	void setParentId(std::string parent_id);
	/*! \brief Get Parent entity type (advertiser, campaign, ad group).
	 */
	std::string getParentType();

	/*! \brief Set Parent entity type (advertiser, campaign, ad group).
	 */
	void setParentType(std::string parent_type);
	/*! \brief Get Always keyword
	 */
	std::string getType();

	/*! \brief Set Always keyword
	 */
	void setType(std::string type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string value);


    private:
    bool archived{};
    int bid{};
    std::string id{};
    MatchType match_type;
    std::string parent_id{};
    std::string parent_type{};
    std::string type{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_Keyword_H_ */
