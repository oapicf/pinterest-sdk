/*
 * KeywordInfo.h
 *
 * Related Keyword information of the editorial article
 */

#ifndef _KeywordInfo_H_
#define _KeywordInfo_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Related Keyword information of the editorial article
 *
 *  \ingroup Models
 *
 */

class KeywordInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordInfo();
	KeywordInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keyword Name
	 */
	std::string getName();

	/*! \brief Set Keyword Name
	 */
	void setName(std::string  name);
	/*! \brief Get MoM growth as a percentage, if there is no growth rate, this field is not present
	 */
	long long getPctGrowthMom();

	/*! \brief Set MoM growth as a percentage, if there is no growth rate, this field is not present
	 */
	void setPctGrowthMom(long long  pct_growth_mom);

private:
	std::string name;
	long long pct_growth_mom;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordInfo_H_ */
