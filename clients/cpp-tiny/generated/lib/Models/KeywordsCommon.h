
/*
 * KeywordsCommon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordsCommon_H_
#define TINY_CPP_CLIENT_KeywordsCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MatchTypeResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordsCommon{
public:

    /*! \brief Constructor.
	 */
    KeywordsCommon();
    KeywordsCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordsCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int bid);
	/*! \brief Get 
	 */
	MatchTypeResponse getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(MatchTypeResponse match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string value);


    private:
    int bid{};
    MatchTypeResponse match_type;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordsCommon_H_ */
