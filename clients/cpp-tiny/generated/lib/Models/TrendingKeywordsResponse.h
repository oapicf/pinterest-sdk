
/*
 * TrendingKeywordsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TrendingKeywordsResponse_H_
#define TINY_CPP_CLIENT_TrendingKeywordsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TrendingKeyword.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TrendingKeywordsResponse{
public:

    /*! \brief Constructor.
	 */
    TrendingKeywordsResponse();
    TrendingKeywordsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingKeywordsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
	 */
	std::list<TrendingKeyword> getTrends();

	/*! \brief Set The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
	 */
	void setTrends(std::list <TrendingKeyword> trends);


    private:
    std::list<TrendingKeyword> trends;
};
}

#endif /* TINY_CPP_CLIENT_TrendingKeywordsResponse_H_ */
