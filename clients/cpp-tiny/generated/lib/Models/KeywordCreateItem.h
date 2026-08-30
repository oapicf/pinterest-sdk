
/*
 * KeywordCreateItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordCreateItem_H_
#define TINY_CPP_CLIENT_KeywordCreateItem_H_


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

class KeywordCreateItem{
public:

    /*! \brief Constructor.
	 */
    KeywordCreateItem();
    KeywordCreateItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordCreateItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int bid);
	/*! \brief Get Keyword [match type](/docs/api-features/targeting-overview/)
	 */
	MatchType getMatchType();

	/*! \brief Set Keyword [match type](/docs/api-features/targeting-overview/)
	 */
	void setMatchType(MatchType match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string value);


    private:
    int bid{};
    MatchType match_type;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordCreateItem_H_ */
