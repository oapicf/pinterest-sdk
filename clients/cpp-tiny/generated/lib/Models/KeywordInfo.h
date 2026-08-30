
/*
 * KeywordInfo.h
 *
 * Related Keyword information of the editorial article
 */

#ifndef TINY_CPP_CLIENT_KeywordInfo_H_
#define TINY_CPP_CLIENT_KeywordInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Related Keyword information of the editorial article
 *
 *  \ingroup Models
 *
 */

class KeywordInfo{
public:

    /*! \brief Constructor.
	 */
    KeywordInfo();
    KeywordInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keyword Name
	 */
	std::string getName();

	/*! \brief Set Keyword Name
	 */
	void setName(std::string name);
	/*! \brief Get MoM growth as a percentage, if there is no growth rate, this field is not present
	 */
	long getPctGrowthMom();

	/*! \brief Set MoM growth as a percentage, if there is no growth rate, this field is not present
	 */
	void setPctGrowthMom(long pct_growth_mom);


    private:
    std::string name{};
    long pct_growth_mom{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordInfo_H_ */
