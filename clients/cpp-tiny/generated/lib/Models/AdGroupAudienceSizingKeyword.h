
/*
 * AdGroupAudienceSizingKeyword.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupAudienceSizingKeyword_H_
#define TINY_CPP_CLIENT_AdGroupAudienceSizingKeyword_H_


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

class AdGroupAudienceSizingKeyword{
public:

    /*! \brief Constructor.
	 */
    AdGroupAudienceSizingKeyword();
    AdGroupAudienceSizingKeyword(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupAudienceSizingKeyword();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	MatchType getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(MatchType match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string value);


    private:
    MatchType match_type;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_AdGroupAudienceSizingKeyword_H_ */
