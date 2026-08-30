
/*
 * KeywordsRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordsRequest_H_
#define TINY_CPP_CLIENT_KeywordsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordsCommon.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordsRequest{
public:

    /*! \brief Constructor.
	 */
    KeywordsRequest();
    KeywordsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keyword JSON array. Each array element has 3 fields
	 */
	std::list<KeywordsCommon> getKeywords();

	/*! \brief Set Keyword JSON array. Each array element has 3 fields
	 */
	void setKeywords(std::list<KeywordsCommon> keywords);
	/*! \brief Get Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	std::string getParentId();

	/*! \brief Set Keyword parent entity ID (advertiser, campaign, ad group).
	 */
	void setParentId(std::string parent_id);


    private:
    std::list<KeywordsCommon> keywords;
    std::string parent_id{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordsRequest_H_ */
