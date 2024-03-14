/*
 * AudienceInsightCategoryCommon.h
 *
 * 
 */

#ifndef _AudienceInsightCategoryCommon_H_
#define _AudienceInsightCategoryCommon_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceInsightCategoryCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceInsightCategoryCommon();
	AudienceInsightCategoryCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceInsightCategoryCommon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getKey();

	/*! \brief Set 
	 */
	void setKey(std::string  key);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	long long getRatio();

	/*! \brief Set 
	 */
	void setRatio(long long  ratio);
	/*! \brief Get 
	 */
	long long getIndex();

	/*! \brief Set 
	 */
	void setIndex(long long  index);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);

private:
	std::string key;
	std::string name;
	long long ratio;
	long long index;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceInsightCategoryCommon_H_ */
