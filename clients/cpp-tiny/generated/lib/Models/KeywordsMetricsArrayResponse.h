
/*
 * KeywordsMetricsArrayResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordsMetricsArrayResponse_H_
#define TINY_CPP_CLIENT_KeywordsMetricsArrayResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordMetricsResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordsMetricsArrayResponse{
public:

    /*! \brief Constructor.
	 */
    KeywordsMetricsArrayResponse();
    KeywordsMetricsArrayResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordsMetricsArrayResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<KeywordMetricsResponse> getData();

	/*! \brief Set 
	 */
	void setData(std::list<KeywordMetricsResponse> data);


    private:
    std::list<KeywordMetricsResponse> data;
};
}

#endif /* TINY_CPP_CLIENT_KeywordsMetricsArrayResponse_H_ */
