
/*
 * KeywordMetrics.h
 *
 * Keyword metrics JSON
 */

#ifndef TINY_CPP_CLIENT_KeywordMetrics_H_
#define TINY_CPP_CLIENT_KeywordMetrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Keyword metrics JSON
 *
 *  \ingroup Models
 *
 */

class KeywordMetrics{
public:

    /*! \brief Constructor.
	 */
    KeywordMetrics();
    KeywordMetrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordMetrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keyword's search frequency. This value is based on keyword frequency in pepsi client response
	 */
	std::string getKeywordQueryVolume();

	/*! \brief Set Keyword's search frequency. This value is based on keyword frequency in pepsi client response
	 */
	void setKeywordQueryVolume(std::string  keyword_query_volume);


    private:
    std::string keyword_query_volume{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordMetrics_H_ */
