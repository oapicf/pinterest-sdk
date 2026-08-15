
/*
 * AdGroupAudienceSizingRequest_keywords_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupAudienceSizingRequest_keywords_inner_H_
#define TINY_CPP_CLIENT_AdGroupAudienceSizingRequest_keywords_inner_H_


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

class AdGroupAudienceSizingRequest_keywords_inner{
public:

    /*! \brief Constructor.
	 */
    AdGroupAudienceSizingRequest_keywords_inner();
    AdGroupAudienceSizingRequest_keywords_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupAudienceSizingRequest_keywords_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    MatchTypeResponse match_type;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_AdGroupAudienceSizingRequest_keywords_inner_H_ */
