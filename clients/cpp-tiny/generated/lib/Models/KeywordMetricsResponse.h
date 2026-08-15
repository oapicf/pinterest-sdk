
/*
 * KeywordMetricsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordMetricsResponse_H_
#define TINY_CPP_CLIENT_KeywordMetricsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordMetrics.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordMetricsResponse{
public:

    /*! \brief Constructor.
	 */
    KeywordMetricsResponse();
    KeywordMetricsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordMetricsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keyword name, e.g., \"keyword\":\"fashion outfits\"
	 */
	std::string getKeyword();

	/*! \brief Set Keyword name, e.g., \"keyword\":\"fashion outfits\"
	 */
	void setKeyword(std::string  keyword);
	/*! \brief Get 
	 */
	KeywordMetrics getMetrics();

	/*! \brief Set 
	 */
	void setMetrics(KeywordMetrics  metrics);


    private:
    std::string keyword{};
    KeywordMetrics metrics;
};
}

#endif /* TINY_CPP_CLIENT_KeywordMetricsResponse_H_ */
